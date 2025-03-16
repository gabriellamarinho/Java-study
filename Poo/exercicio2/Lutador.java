package Poo.exercicio2;

public class Lutador {
    private String nomeLutador;
    private int energia;
    private int forcaLutador;

    // construtor
    public Lutador(String nomeLutador, int energia, int forcaLutador) {
        this.nomeLutador = nomeLutador;
        this.energia = energia;
        this.forcaLutador = forcaLutador;
    }

    // GETTERS AND SETTERS
    public String getNomeLutador() {
        return nomeLutador;
    }

    public void setNomeLutador(String nomeLutador) {
        this.nomeLutador = nomeLutador;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getForcaLutador() {
        return forcaLutador;
    }

    public void setForcaLutador(int forcaLutador) {
        this.forcaLutador = forcaLutador;
    }

    // metodos
    public void reduzirEnergia(Lutador outroLutador) {
        outroLutador.setEnergia(outroLutador.getEnergia() - this.getForcaLutador());
    }

    public void aplicarGolpe(Lutador outroLutador) {
        reduzirEnergia(outroLutador);
    }

}