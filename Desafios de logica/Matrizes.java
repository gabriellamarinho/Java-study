import java.security.SecureRandom;
public class Matrizes {
    public static void main(String[] args) {
        final int linha=3;
        final int coluna=5;
        int [][] numeros =new int [linha][coluna];

        //preenche a matriz com numeros aleatorios ate 100;
        for (int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }//preenche de 0 a 100 a matriz
        }
        // printa a matriz com os elementos ja inseridos;
        for (int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                System.out.printf("%d | ", numeros[l][c]);

            }
            System.out.printf("%n");//quebra de linha
        }
        //ou se preferir usar o for-each 
        for (int[] n:numeros){
            for(int v:n){
                System.out.printf("%d | ",v);
            }
            System.out.printf("%n");
        } 
    }
};

