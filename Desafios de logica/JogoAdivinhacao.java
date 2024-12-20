import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lista = {"sushi", "peixe", "azul", "coral", "vermelho", "banana"};
        int indiceAleatorio = (int) (Math.random() * lista.length);
        String palavra = lista[indiceAleatorio];

        System.out.print("Vamos jogar um jogo de adivinhação? Aceita jogar? sim/nao: ");
        String aceita = scan.nextLine().trim().toLowerCase();

        if (aceita.equals("sim")) {
            System.out.println("Ok, então vamos iniciar!");
            
            int acerto = palavra.length();
            int letrasAcertadas = 0;

            
            while (letrasAcertadas < acerto) {
                System.out.print("Insira aqui uma letra: ");
                String letra = scan.nextLine().trim().toLowerCase();

                if (palavra.contains(letra)) {
                    letrasAcertadas += 1;
                    System.out.printf("Você acertou! %d letras acertadas.\n", letrasAcertadas);
                } else {
                    System.out.println("Letra errada. Tente novamente.");
                }
                    //accertos 
                if (letrasAcertadas == acerto) {
                    System.out.printf("Parabéns! Você acertou todas as letras! A palavra era: %s\n", palavra);
                }
            }
        } else {
            System.out.println("Fim do jogo.");
        }

        scan.close();
    }
}
