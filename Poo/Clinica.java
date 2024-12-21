package Poo;

public class Clinica {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(1, "Carlos", 25, "01/02/1998", "Masculino", "Particular", "Frutos do Mar", "A+");
        
        System.out.println("Dados do Paciente:");
        System.out.println("Código: " + paciente1.getCodigo());
        System.out.println("Nome: " + paciente1.getNomePaciente());
        System.out.println("Idade: " + paciente1.getIdadePaciente());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
        System.out.println("Sexo: " + paciente1.getSexo());
        System.out.println("Plano de Saúde: " + paciente1.getPlanoSaude());
        System.out.println("Alergia: " + paciente1.getAlergia());
        System.out.println("Tipo Sanguíneo: " + paciente1.getTipoSanguineo());

        
        paciente1.setAlergia("amendoim");
        
        System.out.printf("Dados atualizados sobre a alergia do paciente  :",paciente1.getAlergia());
        
    
    }
    
}
