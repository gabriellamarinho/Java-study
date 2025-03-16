public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Olá, vamos iniciar nossa sequência de Fibonacci!!");
        
        int limiteSequencia = 8; 
        int primeirotermo = 1;
        int segundotermo = 1; 
        
        System.out.println("Termo 1: " + primeirotermo); //necessario exibir os 2 primeiros numeros
        System.out.println("Termo 2: " + segundotermo); 

        for (int i = 3; i <= limiteSequencia; i++) { 
            int proximo = primeirotermo + segundotermo;
            System.out.println("Termo " + i + ": " + proximo);

           
            primeirotermo = segundotermo;
            segundotermo = proximo;
        }
    }
}
