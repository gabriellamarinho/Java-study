package Poo.exercicioclinica;

public class Endereco {
    private String rua ;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;
    private int numero;

    public Endereco(String rua , String bairro , String cidade, String uf ,String cep, String complemento, int numero){
        this.rua=rua;
        this.bairro=bairro;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;
        this.complemento=complemento;
        this.numero=numero;

    }

    //getters e setters

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua=rua;
    }

    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    
    public String getCidade(){
        return cidade;

    }
    
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    
    public String getUf(){
        return uf;

    }
    public void setUf(String uf){
        this.uf=uf;
    }
    public String getCep(){
        return cep;

    }
    public void setCep(String cep){
        this.cep=cep;

    }
    public String getComplemento(){
        return complemento;

    }
    
    public void setComplemento(String complemento){
        this.complemento=complemento;
    }
    public int getNumero(){
        return numero;

    }
    public void setNumero(int numero ){
        this.numero=numero;
    }


    public String toString(){
        return rua +"rua 2 "+ bairro+ "santo antonio"+ cidade+"Paulista"+ uf+"PE"+" 55817-987"+"rua da padaria" + 98;
}
}

