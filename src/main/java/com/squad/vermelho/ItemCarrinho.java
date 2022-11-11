package com.squad.vermelho;

public class ItemCarrinho {
    private Double precoUnitario;
    private int quantidade;
    private String nome;
    public Double precoTotalItem;

    public ItemCarrinho(Double precoUnitario, int quantidade, String nome) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.nome = nome;
        this.precoTotalItem = quantidade * precoUnitario;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "{"
                + "nome: " + this.nome + ", "
                + "quantidade: " + this.quantidade + ", "
                + "preco unitário: " + this.precoUnitario + ", "
                + "preço total: " + this.precoTotalItem +
                "}";
    }
}
