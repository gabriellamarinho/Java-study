

import java.util.Scanner;

public class SimuladorDeEmprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){ 
        System.out.print("vc deseja simular um emprestimo?");
        String decisao = scan.nextLine().trim().toLowerCase();
        System.out.println(decisao);
        
        if (decisao.equals("não") || decisao.equals("nao")) {
            System.out.println("Encerrando simulador");
            break;
        } 
        else if (!decisao.equals("sim")) { 
            System.out.println("Opção inválida!");
            continue;
        }
            else{
            System.out.println("ok então vamos iniciar a simulação...");
            
            System.out.println("indique aqui o valor de emprestimo que vc deseja obter em REAIS : ");
            float valordeemprestimo = scan.nextFloat();
            System.out.print("agora digite o valor de juros mensais ");
            String jurosreplace = scan.next().replace(",",".");
            float juros= Float.parseFloat(jurosreplace);

            System.out.print("agora digiteo o periodo de meses que vc vai pegar o emprestimo:  ");
            int meses = scan.nextInt();

            float valorfinal=(valordeemprestimo*(juros/100))*meses;

            System.out.printf("o valor de emprestimo de %f recebendo um juros de %f mensal , no periodo de %d meses , resulta em um total de %f ",valordeemprestimo,juros,meses, valorfinal);
            
            scan.nextLine();
            
            System.out.println("Deseja realizar outra simulação?");
            String repetir = scan.nextLine().trim().toLowerCase();
            scan.close();

            if(repetir == "não" || repetir == "nao"){
                System.out.println("Encerrando simulador");
                break;  
            }else{
                continue;
            }
            
        
    }
}
}
}