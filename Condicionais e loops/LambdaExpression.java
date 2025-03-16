import java.util.Scanner;

interface Areatriangulo {
    int medidas(int a, int b);
}

public class LambdaExpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Areatriangulo formula = (a, b) -> (a * b) / 2;

        System.out.println("Digite aqui o valor da base: ");
        int base = scan.nextInt();

        System.out.println("Digite aqui o valor da altura: ");
        int altura = scan.nextInt();

        int area = formula.medidas(base, altura);
        System.out.printf("A área do triângulo com medidas %d de base e %d de altura é %d!\n", base, altura, area);
        scan.close();
    }
}