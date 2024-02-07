package Farmacia;

import java.util.Scanner;

public class Fornecedores {
	CadastroFornecedor cf = new CadastroFornecedor();
	
	Scanner sc = new Scanner(System.in);
	
	private String cdFornecedor, nomeRa, cnpj, email, senha;
	
	public void menuFornecedor() {
		Menu menu = new Menu();
		int valida; 
		System.out.println("------------------------- Menu produtos -------------------------");
		System.out.println("1 - Cadastrar um Fornecedor");
		System.out.println("2 - Ver a lista de Fornecedores já cadastrados");
		System.out.println("3 - Retorna ao menu principal");
		System.out.println("4 - Sair");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println("Digite uma opção válida:");
		valida = sc.nextInt();
		
		if(valida == 1) {
			cf.cadastrarFornecedor();
			menuFornecedor();
		}else if(valida == 2) {
			cf.exibirFornecedores();
			menuFornecedor();
		}else if(valida == 3) {
			menu.MenuPrincipal();
		}else if(valida == 4) {
			System.out.println("\nAté mais!");
		}
	}

	public String getCdFornecedor() {
		return cdFornecedor;
	}

	public void setCdFornecedor(String cdFornecedor) {
		this.cdFornecedor = cdFornecedor;
	}

	public String getNomeRa() {
		return nomeRa;
	}

	public void setNomeRa(String nomeRa) {
		this.nomeRa = nomeRa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
