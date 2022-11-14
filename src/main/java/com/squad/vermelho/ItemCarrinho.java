package com.squad.vermelho;

public class ItemCarrinho {
    private Double precoUnitario;
    private int quantidade;
    private String nome;
    private Promocao promocao;
    private Frete frete;
    private TaxaExtra taxaExtra;
    public Double precoTotalItem;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.precoUnitario = produto.getPrecoUnitario();
        this.quantidade = quantidade;
        this.nome = produto.getNome();
        this.precoTotalItem = quantidade * produto.getPrecoUnitario();
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

    public void calculaPrecoTotalItem() {

        if (promocao != null) {
            this.precoTotalItem = (this.precoUnitario - (this.precoUnitario * promocao.getDesconto())) * quantidade;
        } else {
            this.precoTotalItem = this.precoUnitario * this.quantidade;
        }

        if (frete != null) {
            this.precoTotalItem = this.precoTotalItem + frete.getValorFrete();
        }
    }

    public Double getPrecoTotalItem() {
        return precoTotalItem;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
        calculaPrecoTotalItem();
    }

    public TaxaExtra getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(TaxaExtra taxaExtra) {
        this.taxaExtra = taxaExtra;
        calculaPrecoTotalItem();
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
        calculaPrecoTotalItem();
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
