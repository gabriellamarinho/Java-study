public class Fatorial {

    // Método para calcular o fatorial de um número
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int j = numero; j > 1; j--) {
            fatorial *= j;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 3;
        int resultado = calcularFatorial(numero);
        System.out.printf("O fatorial do número %d é: %d%n", numero, resultado);
    }
}
