
import java.util.Scanner;

public class GeradorSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String numeroseLetras = "0123456789abcdefghijklmnopqrstuvxwyz";

        char[] caracteres = numeroseLetras.toCharArray();

        System.out.print("Digite o tamanho da senha que você deseja e ela será gerada automaticamente: ");
        int tamanhosenha = scan.nextInt();

        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < tamanhosenha; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[indiceAleatorio]);
        }

        System.out.println("Sua senha gerada foi: " + senha.toString());
        
        scan.close();
    }
}
