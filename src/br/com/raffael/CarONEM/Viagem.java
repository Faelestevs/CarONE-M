package br.com.raffael.CarONEM;

import java.util.ArrayList;

public class Viagem {

  private ArrayList<Local> listaPontos = new ArrayList<>();

  public void adicionarLocal(Local local) {
    listaPontos.add(local);
  }

  public void exibirViagem() {
    for(Local ponto : listaPontos){
      System.out.println(ponto.toString());
    }
  }

  public ArrayList<Local> getListaPontos() {
    return listaPontos;
  }
}
