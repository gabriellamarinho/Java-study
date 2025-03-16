import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Insira aqui os nomes da lista (separados por espaço): ");
        String input = scan.nextLine();
        List<String> nomes = Arrays.asList(input.split(" ")); // Split input string by spaces

        nomes.forEach(nome -> System.out.println("olá, " + nome)); // Print each name individually

        scan.close();
    }
}
