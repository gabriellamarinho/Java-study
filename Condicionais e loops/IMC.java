import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular seu IMC!");
        
        System.out.print("Digite aqui sua altura (use vírgula ou ponto como separador): ");
        String entradaAltura = scan.nextLine();
        entradaAltura = entradaAltura.replace(",", "."); 
        double altura = Double.parseDouble(entradaAltura);
        
        System.out.print("Digite aqui seu peso: ");
        double peso = scan.nextDouble();

        
        double imc = peso / (altura * altura);

        // verificação:
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC está normal: %.2f%n", imc);
        } else if (imc < 18.5) {
            System.out.printf("Seu IMC está abaixo do normal: %.2f%n", imc);
        } else {
            System.out.printf("Seu IMC está acima do normal: %.2f%n", imc);
        }

        scan.close();
    }
}
