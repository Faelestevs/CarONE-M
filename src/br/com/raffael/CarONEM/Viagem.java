package br.com.raffael.CarONEM;

public class Viagem {

    private double raio;
    private Local centroLocal;
    private Destino centroDestino;

    public Viagem(Local centro, double raio){
        this.raio = raio;
        this.centroLocal = centro;
    }

    public Viagem(Destino centroDestino, double raio){
        this.raio = raio;
        this.centroDestino = centroDestino;
    }

    public boolean estaDentro(Local local) {
        double distancia = centroLocal.distancia(local);
        return raio >= distancia;
    }

    public double calculaDistancia(Destino centroDestino) {
        double distancia = centroDestino.distanciaDestino(centroDestino);
        return raio + distancia;
    }


}
