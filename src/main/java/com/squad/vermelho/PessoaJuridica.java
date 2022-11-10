package com.squad.vermelho;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
    String cnpj;

    PessoaJuridica(String nome,
            String endereco,
            Date nascimento,
            String email,
            String telefone,
            String cnpj)

    {
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
}
