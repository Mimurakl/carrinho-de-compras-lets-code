package com.squad.vermelho;

public class Frutas implements Produto {
    
    private Double precoUnitario;
    private String nome;
    private Double promocao;

    public Frutas(Double precoUnitario, String nome) {
        this.precoUnitario = precoUnitario;
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

    
    public void setPromocao(Double valorpromocao) {
        this.promocao = valorpromocao;
    }


    @Override
    public int getQuantidade() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void setQuantidade(int quantidade) {
        // TODO Auto-generated method stub
        
    }
    
}
