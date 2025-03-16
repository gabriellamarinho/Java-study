package Poo.exercicio2;

public class JogoLuta {
    public static void main(String[] args) {
        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);

        // Ryu aplica 3 golpes em Bison
        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }

        System.out.println("Energia de Bison após os golpes de Ryu: " + bison.getEnergia());

        // Bison aplica 8 golpes em Ryu
        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);
        }

        System.out.println("Energia de Ryu após os golpes de Bison: " + ryu.getEnergia());
    }
    
}
