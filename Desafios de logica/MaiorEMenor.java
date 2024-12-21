
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numerosLista=new int[5];
        int maior, menor=0;
        
         menor=Integer.MIN_VALUE;
         maior=Integer.MAX_VALUE;

        for(int i=0;i<numerosLista.length;i++){
            System.out.print("Digite o numero da sua sequencia  " + (i + 1) + ": ");
            numerosLista[i] = scan.nextInt();
            if(numerosLista[i]>maior){
                maior=numerosLista[i];
            }
            if (numerosLista[i] < menor) {
                menor = numerosLista[i];
            }
      
        }
    
        System.out.printf("\nNúmeros da lista: ");
        for (int num : numerosLista) {
            System.out.print(num + " ");
        }
        System.out.printf("\nMaior número: %d\nMenor número: %d\n", maior, menor);
        
        scan.close(); 
    }
}
