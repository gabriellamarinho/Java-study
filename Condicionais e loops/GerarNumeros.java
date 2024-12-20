public class GerarNumeros {
    public static void main(String[] args) {
        System.out.println("Vamos gerar números e aprender a usar loops!");

        int limite = 10;

        for (int i = 1; i <= limite; i++) {
            int dobro = i * 2; 
            
            System.out.printf(
                "Número: %d, Dobro: %d%n",
                i, dobro
            );
        }
    }
}
