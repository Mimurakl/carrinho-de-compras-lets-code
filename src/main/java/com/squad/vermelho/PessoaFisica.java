package com.squad.vermelho;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    String cpf;

    public PessoaFisica(String nome,
            String endereco,
            Date nascimento,
            String email,
            String telefone,
            String cpf)

    {
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}
