package com.squad.vermelho;


public interface Produto {
    public Double getPrecoUnitario();

    public String getNome();

    public void setPrecoUnitario(Double precoUnitario);

    public void setNome(String nome);

    public void setPromocao(Double valorPromocao);

    public Double getPromocao();
}
