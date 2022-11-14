package com.squad.vermelho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("R2D2", "00431291", "r2d2@teste.com", "1625615", "Rua 121872, CASA 17682",
                LocalDate.of(1996, 10, 15));
        List<ItemCarrinho> carrinho = new ArrayList<>();

        adicionaItem(carrinho,"teclado",50.00);
        adicionaItem(carrinho, "acerola", 12.20);
        adicionaItem(carrinho, "mouse", 40.20);
        System.out.println(precoCarrinho(carrinho));

        listarItens(carrinho);

        removeItem(carrinho, "acerola");
        listarItens(carrinho);

        System.out.println(precoCarrinho(carrinho));
    }

    public static Double precoCarrinho(List<ItemCarrinho> carrinho) {
        Double precoTotal = 0.00;

        for (ItemCarrinho item : carrinho) {
            precoTotal += item.getPrecoUnitario() * item.getQuantidade();
        }
        return precoTotal;
    }

    public static void listarItens(List<ItemCarrinho> carrinho) {
        for (ItemCarrinho item : carrinho) {
            System.out.println(item);
        }
        System.out.println("------------------------------------------------------");
    }

    public static void adicionaItem(List<ItemCarrinho> carrinho, String nome, Double preco) {
        for (ItemCarrinho item : carrinho) {

            if (item.getNome().equals(nome)) {
                item.setQuantidade(item.getQuantidade() + 1);
                return;
            }
        }
        carrinho.add(new ItemCarrinho(preco, 1, nome));
    }

    public static void removeItem(List<ItemCarrinho> carrinho, String nome) {
        for (ItemCarrinho item : carrinho) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(item.getQuantidade() - 1);
            }
            if (item.getQuantidade() == 0){
                carrinho.remove(item);
                break;
            }
        }

    }
}
