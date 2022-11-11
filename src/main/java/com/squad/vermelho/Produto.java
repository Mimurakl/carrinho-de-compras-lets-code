package com.squad.vermelho;

import java.math.BigDecimal;

public interface Produto {
    public String getId();

    public BigDecimal getPrecoUnitario();

    public String getNome();

    public void setId(String id);

    public void setPrecoUnitario(BigDecimal precoUnitario);

    public void setNome(String nome);
}

