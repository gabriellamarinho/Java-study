import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, vamos realizar operações com dois números!");


        System.out.println("Digite aqui o primeiro número:");
        String entradaNumero1 = scan.nextLine().replace(",", ".");
        double numero1 = Double.parseDouble(entradaNumero1);

        System.out.println("Digite aqui o segundo número:");
        String entradaNumero2 = scan.nextLine().replace(",", ".");
        double numero2 = Double.parseDouble(entradaNumero2);

        System.out.println("Qual operação você deseja realizar? (soma, subtração, multiplicação, divisão)");
        String resposta = scan.nextLine().trim().toLowerCase();

        switch (resposta) {

            case "soma":
                double resultadoSoma = numero1 + numero2;
                System.out.printf("O resultado da soma de %.2f e %.2f é %.2f%n", numero1, numero2, resultadoSoma);
                break;

            case "subtração":
                double resultadoSubtracao = numero1 - numero2;
                System.out.printf("O resultado da subtração de %.2f e %.2f é %.2f%n", numero1, numero2, resultadoSubtracao);
                break;

            case "multiplicação":
                double resultadoMultiplicacao = numero1 * numero2;
                System.out.printf("O resultado da multiplicação de %.2f e %.2f é %.2f%n", numero1, numero2, resultadoMultiplicacao);
                break;

            case "divisão":
                if (numero2 != 0) {
                    double resultadoDivisao = numero1 / numero2;
                    System.out.printf("O resultado da divisão de %.2f por %.2f é %.2f%n", numero1, numero2, resultadoDivisao);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
                
            default:
                System.out.println("Operação inválida. Tente novamente com: soma, subtração, multiplicação ou divisão.");
                break;
        }

        scan.close();
    }
}
