package com.squad.vermelho;

import java.math.BigDecimal;

public interface Produto {
    public Double getPrecoUnitario();

    public int getQuantidade();

    public String getNome();

    public void setPrecoUnitario(Double precoUnitario);

    public void setQuantidade(int quantidade);

    public void setNome(String nome);
}
