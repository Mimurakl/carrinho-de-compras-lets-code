package com.squad.vermelho;

import java.util.ArrayList;

public class FrutasRepository {
    private ArrayList<Frutas> frutas;

    public FrutasRepository() {
       this.frutas  = new ArrayList<>();
       this.setUpFrutas();
    }

    private void setUpFrutas(){
        this.frutas.add(new Frutas(2.00, "Maçã"));
        this.frutas.add(new Frutas(1.50, "Laranja"));
        this.frutas.add(new Frutas(15.00, "Melancia"));
    }

    public ArrayList<Frutas> getFrutas() {
        return frutas;
    }

    public Frutas getFrutasPorNome(String nome) {
        for (Frutas fruta : frutas) {
            if(fruta.getNome().equals(nome)){
                return fruta;
            }
        }
        
        return null;
    }

}
