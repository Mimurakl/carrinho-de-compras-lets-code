package com.squad.vermelho;

public class ColecaoItem {
    private ItemCarrinho itemCarrinho;
    private int quantidade;

    public ColecaoItem(ItemCarrinho itemCarrinho, int quantidade) {
        this.itemCarrinho = itemCarrinho;
        this.quantidade = quantidade;
    }

    public ColecaoItem(ItemCarrinho itemCarrinho) {
        this(itemCarrinho, 1);
    }

    public ItemCarrinho getItemCarrinho() {
        return itemCarrinho;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
