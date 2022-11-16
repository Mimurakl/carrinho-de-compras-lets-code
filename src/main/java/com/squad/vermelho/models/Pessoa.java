package com.squad.vermelho.models;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String telefone;
    protected String endereco;
    
    public Pessoa(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "{" 
                    + "nome: " + this.nome + ", " 
                    + "email: " + this.email + ", " 
                    + "telefone: " + this.telefone + ", " 
                    + "endereco: " + this.endereco + 
                "}";
    }

}
