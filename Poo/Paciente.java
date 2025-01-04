package Poo;

public class Paciente {
    private int codigo;
    private String nomePaciente;
    private int idadePaciente;
    private String dataNascimento;
    private String sexo;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;

    public Paciente(int codigo, String nomePaciente, int idadePaciente, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo) {
        this.codigo = codigo;
        this.nomePaciente = nomePaciente;
        this.idadePaciente = idadePaciente;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }
    void status(){
        System.out.printf("Codigo: %s\nNome paciente: %s\n Idade paciente :%d\n Data nascimento %d\n Sexo paciente :%d\n Plano de saúde"+this.codigo+this.nomePaciente+this.idadePaciente+this.dataNascimento+this.sexo+this.planoSaude+this.alergia+this.tipoSanguineo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(int idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
}