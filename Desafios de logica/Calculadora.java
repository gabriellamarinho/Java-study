import java.util.Scanner;

//primeira opção feita para calcular somente com entrada de 2 numeros 

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.print("olá , vamos realizar operações contendo a entrada de dois numero \n Vamos iniciar! ");
        System.out.print("Digite aqui o primeiro numero:");
        String entradanumero1= scan.nextLine().replace(",",".");
        double numero1=Double.parseDouble(entradanumero1);

        System.out.print("Digite aqui o primeiro numero:");
        String entradanumero2= scan.nextLine().replace(",",".");
        double numero2=Double.parseDouble(entradanumero2);

        

        
    }

}

//segunda opção para calcular com mais de 2 numeros em operações
