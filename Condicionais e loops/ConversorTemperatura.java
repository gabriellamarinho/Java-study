import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a conversão que você deseja realizar:");
        System.out.println("1 - Fahrenheit para Celsius");
        System.out.println("2 - Celsius para Fahrenheit");
        int conversao = scan.nextInt(); 

        switch (conversao) {
            case 1: 
                System.out.print("Digite o valor em Fahrenheit para realizar a conversão: ");
                double fahrenheit = scan.nextDouble(); 
                double celsius = (5.0 / 9) * (fahrenheit - 32); 
                System.out.printf("O valor em Celsius é: %.2f\n", celsius);
                break;

            case 2: 
                System.out.print("Digite o valor em Celsius para realizar a conversão: ");
                celsius = scan.nextDouble(); 
                fahrenheit = (celsius * 9.0 / 5) + 32; 
                System.out.printf("O valor em Fahrenheit é: %.2f\n", fahrenheit);
                break;

            default:
                System.out.println("Digite uma opção valida : 1 ou 2 !");
                break;
        }

        scan.close();
    }
}
