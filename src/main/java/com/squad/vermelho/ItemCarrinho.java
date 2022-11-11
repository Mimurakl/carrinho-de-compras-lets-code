package com.squad.vermelho;

import java.math.BigDecimal;

public class ItemCarrinho implements Produto {
    private String id;
    private BigDecimal precoUnitario;
    private String nome;

    public ItemCarrinho(String id ,BigDecimal precoUnitario, String nome) {
        this.id = id;
        this.precoUnitario = precoUnitario;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setPrecoUnitario(BigDecimal precoUnitario) {
       this.precoUnitario = precoUnitario;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    

    @Override
    public void setId(String id) {
        this.id = id;
    }

}
