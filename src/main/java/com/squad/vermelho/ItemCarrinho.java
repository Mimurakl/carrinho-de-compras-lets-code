package com.squad.vermelho;



public class ItemCarrinho implements Produto {
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


    @Override
    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
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
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" 
                    + "nome: " + this.nome + ", " 
                    + "quantidade: " + this.quantidade + ", " 
                    + "preco unitário: " + this.precoUnitario + ", " 
                    + "preço total: " +  this.precoTotalItem + 
                "}";
    }

}
