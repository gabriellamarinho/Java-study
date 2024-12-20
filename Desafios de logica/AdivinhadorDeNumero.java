import java.util.Scanner;

public class AdivinhadorDeNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 56};
        boolean continuar = true; 

        while (continuar) {
            System.out.println("Insira aqui um número ou digite 'sair' para encerrar:");

            if (!scan.hasNextInt()) {
                String entrada = scan.next();
                if (entrada.equalsIgnoreCase("sair")) {
                    continuar = false;
                    System.out.println("Obrigado por jogar! Até mais.");
                    break;
                } else {
                    System.out.println("Por favor, insira um número válido.");
                    continue; 
                }
            }

            int recebeDado = scan.nextInt();
            boolean encontrado = false;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == recebeDado) {
                    encontrado = true;
                    System.out.printf("\nO número %d está contido na lista, na posição %d!\n", recebeDado, i+=1);
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("O número inserido não está na lista. Tente novamente.");
            }
        }

        scan.close();
    }
}
