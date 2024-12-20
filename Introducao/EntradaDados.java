package Introducao;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Olá, vamos testar a entrada de dados? Você vai precisar informar seu nome, idade e altura.\n");

        System.out.print("Insira aqui seu nome: ");
        String nome = scan.nextLine().trim(); 

        System.out.print("Insira aqui sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Insira aqui sua altura: ");
        String stringAltura = scan.nextLine().replace(",", ".");

        double altura = Double.parseDouble(stringAltura); // Converter para double

        System.out.printf("Olá %s, obrigado por informar seus dados! \nVamos repeti-los: \n%s tem %d anos de idade e %.2f de altura.\n", 
                          nome, nome, idade, altura);
        
        scan.close(); 
    }
}
