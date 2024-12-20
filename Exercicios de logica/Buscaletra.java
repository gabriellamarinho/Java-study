import java.util.Scanner;

public class Buscaletra {
        public static void teste() {
        Scanner scan = new Scanner(System.in); 
        
        String letra ,palavra ="";
        System.out.print("Escolha uma letra de A a Z: ");
        letra = scan.nextLine().trim().toLowerCase();
        
        int qtdletra = 0;

        for (int i = 0; i < palavra.length(); i++) { 
            if (palavra.charAt(i) == letra.charAt(0)) {
                qtdletra++;
            }
        }

        if (qtdletra == 0) {
            System.out.println("Infelizmente sua palavra não possui a letra.");
        }

        System.out.printf("Analisando... Sua palavra \"%s\" tem %d caracteres e possui a letra \"%s\" %d vezes na palavra.%n", palavra, palavra.length(), letra, qtdletra);

        scan.close();
    }
}


