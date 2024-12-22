package Poo;

public class Medico {
    private int codigoMedico;
    private String nomeMedico;
    private String sexoMedico;
    private String especialidade;
    private String endereco;
    
    public Medico(int codigoMedico, String nomeMedico, String sexoMedico, String especialidade, String Endereco){
        this.codigoMedico=codigoMedico;
        this.nomeMedico=nomeMedico;
        this.sexoMedico=sexoMedico;
        this.especialidade=especialidade;
        this.endereco=endereco;
    }
    public int gatCodigoMedico(){
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico){
        this.codigoMedico=codigoMedico;
    }

    public String getNomeMedico(){
        return nomeMedico;
    }
    
    public void setNomeMedico(String nomeMedico){
        this.nomeMedico=nomeMedico;
    }
    
    public String getSexoMedico(){
        return sexoMedico;

    }
    
    public void setSexoMedico(String sexoMedico){
        this.sexoMedico=sexoMedico;
    }
    
    public String getEspecialidade(){
        return especialidade;

    }
    public void setEspecialidade(String especialidade){
        this.especialidade=especialidade;
    }
    public String getEndereco(){
        return endereco;

    }
    public void setEndereco(String endereco){
        this.endereco=endereco;

    }
    public String toString() {
    return "Código: " + codigoMedico + ", Nome: " + nomeMedico + ", Sexo: " + sexoMedico + 
               ", Especialidade: " + especialidade + ", Endereço: [" + endereco + "]";
}
}






