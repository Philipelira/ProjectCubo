package Farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaProdutos extends Produtos{
	public ListaProdutos(String nomeProd, String codProd, String tipoProd, String vlrProd) {
		super(nomeProd, codProd, tipoProd, vlrProd);
	}
	
	Scanner sc = new Scanner(System.in);

	List<Produtos> listaProd = new ArrayList<Produtos>();
	
	public void adicionarLista() {
		if(listaProd.isEmpty()) {
			listaProduto();
		}
	}
	
	public void menuProdutos() {
		Menu menu = new Menu();
		int valida = 0;
		System.out.println("------------------------- Menu produtos -------------------------");
		System.out.println("1 - Cadastrar um produto");
		System.out.println("2 - Ver a lista de produtos já cadastrados");
		System.out.println("3 - Retorna ao menu principal");
		System.out.println("4 - Sair");
		valida = sc.nextInt();
		System.out.println("-----------------------------------------------------------------\n");
		
		if(valida == 1) {
			adicionarItem();
			menuProdutos();
		}
		else if(valida == 2) {
			verListaProd();
			menuProdutos();
		}
		else if(valida == 3) {
			menu.MenuPrincipal();
		}
		else if(valida == 4) {
			System.out.println("\nAté mais!\n");
		}
	}
	
	@Override
	public void adicionarItem() {
		
		 	System.out.println("Informe o nome do produto que deseja adicionar:");
		 
		    String nome = sc.next(); 
		    
		    System.out.println("Informe o código do produto:");
		    
		    String cod = sc.next();
		    
		    System.out.println("Informe o tipo do produto:");
		    
		    String tipo = sc.next();
		    
		    System.out.println("Informe o valor do produto:");
		    
		    String valor = sc.next();

		
		    Produtos novoProd = new Produtos(nome, cod, tipo, valor);
		    
		    listaProd.add(novoProd);
		
		    System.out.println("\nProduto cadastrado com sucesso!\n");
	}
	
	public void listaProduto() {
		listaProd.add(new Produtos("Paracetamol", "ANAG02", "Analgésico", "7.50"));
		listaProd.add(new Produtos("Ibuprofeno", "ANTI01", "Anti-inflamatório", "8.99"));
		listaProd.add(new Produtos("Dipirona", "ANAG01", "Analgésico", "5.25"));
		listaProd.add(new Produtos("Omeprazol", "ANTC01", "Antiácido", "12.75"));
		listaProd.add(new Produtos("Loratadina", "ANT01", "Antialérgico", "9.30"));
	}
	
    public void verListaProd() {
        System.out.println("\n------------- Lista completa de produtos -------------");
        for (Produtos produtos : listaProd) {
            System.out.println("----------------------------------------------------");
            System.out.println("Nome do produto => " + produtos.getNomeProd());
            System.out.println("Código do produto => " + produtos.getCodProd());
            System.out.println("Tipo do produto => " + produtos.getTipoProd());
            System.out.println("Valor do produto => " + produtos.getVlrProd());
            System.out.println("----------------------------------------------------");
        }
        
       System.out.println("\n------------- Fim da lista de produtos ----------------\n");
       
    }
    
    public Produtos escolherProduto() {
        System.out.println("Informe o código do produto que deseja comprar:");
        String codigo = sc.next();
        for (Produtos produto : listaProd) {
            if (produto.getCodProd().equals(codigo)) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }
}
