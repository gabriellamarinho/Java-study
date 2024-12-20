import java.util.Scanner;

public class AreaDePoligonos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular a área dos polígonos!");
        System.out.print("Qual polígono você gostaria de saber a área (círculo, quadrado, retângulo,triangulo)? ");
        String poligono = scan.nextLine().trim().toLowerCase();

        double altura, largura, comprimento, raio, area = 0;

        switch (poligono) {
            case "circulo":
                System.out.print("Digite aqui o valor do raio: ");
                raio = scan.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f%n", area);
                break;

            case "quadrado":
                System.out.print("Digite o valor do lado do quadrado: ");
                comprimento = scan.nextDouble();
                area = Math.pow(comprimento, 2);
                System.out.printf("A área do quadrado é: %.2f%n", area);
                break;

            case "retangulo":
                System.out.print("Digite a altura do retângulo: ");
                altura = scan.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                largura = scan.nextDouble();
                area = altura * largura; 
                System.out.printf("A área do retângulo é: %.2f%n", area);
                break;

            case "triangulo":
                System.out.print("Digite a altura do triangulo: ");
                altura= scan.nextDouble();
                System.out.print("digite a area da base: ");
                largura= scan.nextDouble();
                area=(largura *altura)/2;
                System.out.printf("A area do triangulo é %.2f%n", area);
                break;
            default:
                System.out.println("Polígono não reconhecido. Tente novamente com círculo, quadrado ou retângulo.");
                break;
        }

        scan.close();
    }
}

