package br.com.raffael.CarONEM;

import java.util.ArrayList;

public class Viagem {

  private ArrayList<Local> listaViagens;

  public void adicionarLocal(Local local) {
    listaViagens = new ArrayList<Local>();
    listaViagens.add(local);
  }

  public ArrayList<Local> getListaViagens() {
    return listaViagens;
  }
}
