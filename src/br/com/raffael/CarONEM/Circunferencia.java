package br.com.raffael.CarONEM;

// Provavelmente será utilizado na opção de buscar viagem

public class Circunferencia {
    private double raio;
    private Local centroLocal;

    public Circunferencia(Local centro, double raio){
        this.raio = raio;
        this.centroLocal = centro;
    }

    public boolean estaDentro(Local local) {
        double distancia = centroLocal.distancia(local);
        return raio >= distancia;
    }

}
