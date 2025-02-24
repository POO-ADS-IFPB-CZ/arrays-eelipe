
package view;

import model.Item;
import model.Produto;
import model.Venda;

public class Main {
    public static void main(String[] args) {

        Venda venda = new Venda();
        venda.adicionarProdutos();

        System.out.println("\nResumo da Venda:");
        for (Item item : venda.getItens()) {
            System.out.println("Produto: " + item.getProduto().getDescricao() +
                    ", Categoria: " + item.getProduto().getCategoria() +
                    ", Quantidade: " + item.getQuantidade() +
                    ", Subtotal: " + item.getSubtotal());
        }

        System.out.println("Total da venda: " + venda.getTotal());
    }
}
