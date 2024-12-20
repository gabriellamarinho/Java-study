import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, irei calcular a sua média e informar se você está na média, acima da média ou abaixo da média!");
        
        System.out.print("Digite a primeira nota: ");
        double valornota1= scan.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double valornota2 = scan.nextDouble();

        double media = (valornota1 + valornota2) / 2;

        if (media >= 7) {
            System.out.printf("Sua média é %.2f. Você está APROVADO e acima da média!\n", media);
        } else if (media >= 5) {
            System.out.printf("Sua média é %.2f. Você está na MÉDIA, mas precisa melhorar.\n", media);
        } else {
            System.out.printf("Sua média é %.2f. Você está REPROVADO e abaixo da média.\n", media);
        }

        scan.close();
    }
}
