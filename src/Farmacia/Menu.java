package Farmacia;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	LoginFarma lf = new LoginFarma();
	ListaProdutos listaproduto = new ListaProdutos(null, null, null, null);
	Fornecedores fornecedores = new Fornecedores();
	Vendas vendas = new Vendas(listaproduto);
	
	
	public void MenuLogin(){
		int validacao;
		System.out.println("|----------- Bem-vindo a Farmacia PagueMais -----------|");
		System.out.println("|                    1 - Fazer Login                   |");
		System.out.println("|                    2 - Cadastrar Conta               |");
		System.out.println("|                    3 - Sair                          |");
		System.out.println("|------------------------------------------------------|");
		System.out.println("|Digite a opcação desejada:                            |"); 
		validacao = sc.nextInt();
		switch(validacao){
			case 1:
				System.out.println("");
				lf.LoginConta();
				break;
			case 2:
				System.out.println("");
				lf.CadastrarConta();
				MenuLogin();
				break;
			case 3:
				lf.VerContasCadastradas();
				break;
		}
		
	}
	
	public void MenuPrincipal() {
		int valida;
		System.out.println("|--------------- Menu - Farmacia PagueMais ---------------|");
		System.out.println("|                1 - Realizar Venda                       |");
		System.out.println("|                2 - Produtos                             |");
		System.out.println("|                3 - Fornecedores                         |");
		System.out.println("|                4 - Mudar de conta                       |");
		System.out.println("|                5 - Encerrar                             |");
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|Digite a opção desejada:                                 |");
		valida = sc.nextInt();
		switch(valida) {
			case 1:
				listaproduto.adicionarLista();
				vendas.realizaVenda();
				break;
			case 2:
				 listaproduto.adicionarLista();
				 listaproduto.menuProdutos();
				break;
			case 3:
				fornecedores.menuFornecedor();
				break;
			case 4:
				MenuLogin();
				break;
			case 5:
				break;
		}
	}
}
