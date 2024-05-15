package br.com.raffael.CarONEM;

// Perguntar ao prof se estamos no caminho certo ao utilizar esse tipo de referência para
// Verificar se está no raio de 2KM

public class Local {

    private int pontoX;
    private int pontoY;
    private String endereco;

    public Local(int pontoX, int pontoY, String endereco){
        this.pontoX = pontoX;
        this.pontoY = pontoY;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        {return "Ponto X: " + this.getPontoX() + " // Ponto Y: " + this.getPontoY() + " // Endereço: " + this.getEndereco();}
    }
}
