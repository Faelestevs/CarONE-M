package br.com.raffael.CarONEM;

// A classe destino herda as características da Classe local
// Reutilizamos as variáveis dos pontos X e Y

public class Destino extends Local {

    public Destino(int pontoX, int pontoY, String endereco) {
        super(pontoX, pontoY, endereco);
    }

    public double distanciaDestino(Destino destino) {
        double soma = Math.pow(destino.getPontoX() - getPontoX(), 2) + Math.pow(destino.getPontoY() - getPontoY(), 2);
        return Math.sqrt(soma);
    }
}
