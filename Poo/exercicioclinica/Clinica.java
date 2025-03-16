package Poo.exercicioclinica;

public class Clinica {
    public static void main(String[] args) {
        //criando o paciente 
        Paciente paciente1 = new Paciente(1, "Carlos", 25, "01/02/1998", "Masculino", "Particular", "Frutos do Mar", "A+");
        
        //printando os dados :
        System.out.println("Codigo do apciente: "+ paciente1.getCodigo()+"/nNome do paciente "+paciente1.getNomePaciente()+"/nIdade do paciente : "+paciente1.getIdadePaciente()+ "/nData de nascimento: "+paciente1.getDataNascimento()+ "/nSexo do paciente:"+paciente1.getSexo()+"/nPlano de saude do paciente: "+paciente1.getPlanoSaude()+"/nAlergia: "+ paciente1.getAlergia()+ "/ntipo sanguineo: "+paciente1.getTipoSanguineo());

        paciente1.setAlergia("amendoim");
        
        System.out.printf("Dados atualizados sobre a alergia do paciente  :",paciente1.getAlergia());
        
        //endereço e medico
        Endereco endereco = new Endereco("Rua A", "Bairro B", "Cidade C", "UF D", "12345-678", "Complemento E", 100);

        Medico medico = new Medico(1, "Dr. Fernando", "M","Cardiologia", endereco);

        // Imprimindo os dados dos objetos
        System.out.println("Dados do Endereço:");
        System.out.println(endereco);

        System.out.println("\nDados do Médico:");
        System.out.println(medico);

        // Modificando os dados dos objetos
        endereco.setRua("Rua X");
        endereco.setNumero(200);

        medico.setNomeMedico("Dra. Ciclana");
        medico.setEspecialidade("Dermatologia");

        // Imprimindo os dados modificados
        System.out.println("\nDados do Endereço (Modificado):");
        System.out.println(endereco);

        System.out.println("\nDados do Médico (Modificado):");
        System.out.println(medico);
    
    }
    
}
