package com.squad.vermelho;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    protected String cpf;
    protected LocalDate dataNascimento;

    public PessoaFisica(String nome, String cpf, String email, String telefone, String endereco, LocalDate dataNascimento) {
        super(nome, email, telefone, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "{" 
                    + "nome: " + this.nome + ", " 
                    + "cpf: " + this.cpf + ", "
                    + "datanascimento: " + this.dataNascimento + ", "
                    + "telefone: " + this.telefone + ", "
                    + "email: " + this.email + ", " 
                    + "telefone: " + this.telefone + ", " 
                    + "endereco: " + this.endereco + 
                "}";
    }
}
