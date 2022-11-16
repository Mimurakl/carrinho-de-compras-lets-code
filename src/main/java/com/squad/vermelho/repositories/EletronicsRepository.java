package com.squad.vermelho.repositories;

import java.util.ArrayList;

import com.squad.vermelho.models.Eletronicos;

public class EletronicsRepository {
    private ArrayList<Eletronicos> eletronicos;

    public EletronicsRepository() {
       this.eletronicos  = new ArrayList<>();
       this.setUpEletronicos();
    }

    private void setUpEletronicos(){
        this.eletronicos.add(new Eletronicos(20.00, "Mouse"));
        this.eletronicos.add(new Eletronicos(600.50, "Monitor"));
        this.eletronicos.add(new Eletronicos(120.00, "Headset"));
    }

    public ArrayList<Eletronicos> getEletronicos() {
        return eletronicos;
    }

    public Eletronicos getEletronicosPorNome(String nome) {
        for (Eletronicos eletronico : eletronicos) {
            if(eletronico.getNome().equals(nome)){
                return eletronico;
            }
        }
        
        return null;
    }

}