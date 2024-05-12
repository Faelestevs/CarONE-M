package br.com.raffael.CarONEM;

public class Local {

    private int pontoX;
    private int pontoY;
    private String endereco;

    public Local(int pontoX, int pontoY, String endereco){
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public double distancia(Local local) {
        double soma = Math.pow(local.pontoX - pontoX, 2) + Math.pow(local.pontoY - pontoY, 2);
        return Math.sqrt(soma);
    }

    public int getPontoX() {
        return pontoX;
    }

    public void setPontoX(int pontoX) {
        this.pontoX = pontoX;
    }

    public int getPontoY() {
        return pontoY;
    }

    public void setPontoY(int pontoY) {
        this.pontoY = pontoY;
    }
}
