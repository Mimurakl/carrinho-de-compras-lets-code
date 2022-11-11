package com.squad.vermelho;

public class Eletronicos implements Produto {
    private Double precoUnitario;
    private int quantidade;
    private String nome;
    private Double promocao;


    public Eletronicos(Double precoUnitario, int quantidade, String nome) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.nome = nome;
        this.promocao = 1.0;
    }

    @Override
    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setPrecoUnitario(Double precoUnitario) {
       this.precoUnitario = precoUnitario;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void isPromocao(Double valorpromocao) {
        this.promocao = valorpromocao;
    }
}
