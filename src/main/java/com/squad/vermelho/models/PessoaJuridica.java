package com.squad.vermelho.models;

public class PessoaJuridica extends Pessoa {

    protected String cnpj;

    public PessoaJuridica(String nome, String cnpj, String email, String telefone, String endereco) {
        super(nome, email, telefone, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "{" 
                    + "nome: " + this.nome + ", " 
                    + "cnpj: " + this.cnpj + ", "
                    + "telefone: " + this.telefone + ", "
                    + "email: " + this.email + ", " 
                    + "telefone: " + this.telefone + ", " 
                    + "endereco: " + this.endereco + 
                "}";
    }
}
