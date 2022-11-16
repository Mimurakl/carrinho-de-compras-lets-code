package com.squad.vermelho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    PessoaFisica p1 = new PessoaFisica("R2D2", "00431291", "r2d2@teste.com", "1625615", "Rua 121872, CASA 17682",
        LocalDate.of(1996, 10, 15));

    var eletronicoRepository = new EletronicsRepository();
    var frutasRepository = new FrutasRepository();

        
    ItemCarrinho item1 = new ItemCarrinho(frutasRepository.getFrutasPorNome("Maçã"), 2);
    ItemCarrinho item2 = new ItemCarrinho(eletronicoRepository.getEletronicosPorNome("Mouse"), 1);
    ItemCarrinho item3 = new ItemCarrinho(eletronicoRepository.getEletronicosPorNome("Headset"), 1);
    ItemCarrinho item4= new ItemCarrinho(eletronicoRepository.getEletronicosPorNome("Monitor"), 1);


    item2.setPromocao(new Promocao("blackFriday", 0.1));
    item3.setFrete(new Frete());
    item4.setPromocao(new Promocao("promoday", 0.1));
    item4.setFrete(new Frete());
    item4.setTaxaExtra(new TaxaExtra(10.00));

    Carrinho carrinho = new Carrinho(p1);

    carrinho.adicionaItem(item1);
    carrinho.adicionaItem(item2);
    carrinho.adicionaItem(item3);
    carrinho.adicionaItem(item4);
    carrinho.alteraQuantidadeItem(item2,2);
    carrinho.removeItem(item1);

    carrinho.listarItens();

    System.out.println(carrinho.precoCarrinho());

  }

}
