package com.squad.vermelho;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private List<ColecaoItem> itensNoCarrinho = new ArrayList<>();  

    public void adicionaProduto(ColecaoItem colecaoItem){
        this.itensNoCarrinho.add(colecaoItem);
    }

    public int obtemTotalItensNoCarrinho(){
        int totalItensNoCarrinho = 0;
        for (ColecaoItem colecaoItem : itensNoCarrinho) {
            totalItensNoCarrinho += colecaoItem.getQuantidade();
        }
        return totalItensNoCarrinho;
    }
}
