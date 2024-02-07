package Farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginFarma {
	
	Scanner sc = new Scanner(System.in);
	String login, senha;
	
	List<UserFuncionarios> contaCadastrada = new ArrayList<>();
	
	public void ContaPadrao() {
		UserFuncionarios uf = new UserFuncionarios();
		uf.setNome("mvmv");
		uf.setSenha("mvmv");
		uf.setMail("mvmv");
		uf.setCpf("mvmv");
		
		contaCadastrada.add(uf);
	}
	
	public void CadastrarConta() {
		UserFuncionarios uf = new UserFuncionarios();
		
		System.out.println("|------------- Cadastro de conta -------------|");
		System.out.println("|              Informe seu nome:              |");
		uf.setNome(sc.nextLine());
		System.out.println("|              Informe seu e-mail:            |");
		uf.setMail(sc.nextLine());
		System.out.println("|              Informe seu cpf:               |");
		uf.setCpf(sc.nextLine());
		System.out.println("|            Digite a senha desejada:         |");
		uf.setSenha(sc.nextLine());
		System.out.println("|---------------------------------------------|");
		
		contaCadastrada.add(uf);
		
		System.out.println("\nConta cadastrado com sucesso!");
		
	}
	
	public void LoginConta() {
		Menu mn = new Menu();
		ContaPadrao();
		System.out.println("|---------------- Login na Farmácia ----------------|");
		System.out.println("|                Digite seu nome:                   |");
		login = sc.nextLine();
		System.out.println("|                Digite sua senha:                  |");
		senha = sc.nextLine();
		System.out.println("|---------------------------------------------------|");
		
		for(UserFuncionarios userLogin : contaCadastrada) {
			if(login.equals(userLogin.getNome()) && senha.equals(userLogin.getSenha())) {
				System.out.println("Login efetuado com sucesso!\n");
				mn.MenuPrincipal();
			}
			else {
				System.out.println("Login ou senha incorreto.");
				mn.MenuLogin();
			}
		}
	}
	
	public void VerContasCadastradas() {
		for (UserFuncionarios uf : contaCadastrada) {
			System.out.println(uf.getNome());
			System.out.println(uf.getSenha());
		}
	}
	
}
