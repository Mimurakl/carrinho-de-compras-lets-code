package com.squad.vermelho.models;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Pessoa pessoa;
    private ArrayList<ItemCarrinho> itens;

    public Carrinho(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.itens = new ArrayList<>();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void adicionaItem(ItemCarrinho item) {

        int index = this.itens.indexOf(item);

        if (index > -1) {
            ItemCarrinho old = this.itens.get(index);
            old.setQuantidade(old.getQuantidade() + item.getQuantidade());
            old.calculaPrecoTotalItem();
            return;
        }

        this.itens.add(item);
        item.calculaPrecoTotalItem();
    }

    public void removeItem(ItemCarrinho item) {

        if (this.itens.contains(item)) {
            this.itens.remove(item);
        }
    }

    public  Double precoCarrinho() {
        Double precoTotal = 0.00;

        for (ItemCarrinho item : this.itens) {
            precoTotal += item.getPrecoTotalItem();
        }

        return precoTotal;
    }

    public void listarItens() {
        for (ItemCarrinho item : this.itens) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------");
    }

    public  void alteraQuantidadeItem(ItemCarrinho item, Integer quantidade) {

        int index = this.itens.indexOf(item);

        if (index > -1) {
            ItemCarrinho old = this.itens.get(index);
            old.setQuantidade(quantidade);
            old.calculaPrecoTotalItem();
            return;
        }
    }

}
