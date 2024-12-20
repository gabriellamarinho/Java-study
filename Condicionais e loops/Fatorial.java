public class Fatorial {
    public static void main(String[] args) {
        int numero = 3; 
        int fatorial = 1; 

        for (int j = numero; j > 1; j--) {
            fatorial *= j;
        }

        System.out.printf("O fatorial do número %d é: %d%n", numero, fatorial);
    }
}
