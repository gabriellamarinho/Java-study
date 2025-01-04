package testes;

public class Caneta {
        public String modelo;
        public String cor;
        public int carga;
        public boolean tampada;
        public Float ponta; 
    
    
    void status(){

        System.out.println("uma caneta: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Está tampada? "+this.tampada);
        //sout
    }
    void rabiscar(){
        if(tampada){
            System.out.print("ERRO");
        }else{
            System.out.print("RABISCADO");

        }
    
    }

    void tampar(){

    }
    void destampar(){
        
    }
}
