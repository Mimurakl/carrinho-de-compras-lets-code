package com.squad.vermelho;

public class Promocao {
    private Double desconto;
    private String nome;

    public Promocao(String nome, double desconto) {
        this.nome = nome;
        this.desconto = desconto;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

}
