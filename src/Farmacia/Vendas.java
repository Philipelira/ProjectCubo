package Farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendas {
    private ListaProdutos listaProdutos;
    private List<Produtos> produtosVendidos;
    Scanner scanner = new Scanner(System.in);

    public Vendas(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
        this.produtosVendidos = new ArrayList<>();
    }

    public void realizaVenda() {
    	Menu mn = new Menu();
        double total = 0.0;
        boolean continuarVenda;

        do {
            listaProdutos.verListaProd();
            Produtos produtoEscolhido = listaProdutos.escolherProduto();

            if (produtoEscolhido != null) {
                produtosVendidos.add(produtoEscolhido);
                total += Double.parseDouble(produtoEscolhido.getVlrProd());
            }

            System.out.println("Deseja adicionar mais produtos à venda? (S/N)");
            String resposta = scanner.next();
            continuarVenda = resposta.equalsIgnoreCase("S");

        } while (continuarVenda);

        System.out.println("Total da venda: " + total + "\n");
        mn.MenuPrincipal();
       }
}
