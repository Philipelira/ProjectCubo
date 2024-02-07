package Farmacia;

import java.util.Scanner;

public class CadastroFornecedor {
    Scanner ler = new Scanner(System.in);
    private Fornecedores[][] fornecedores = new Fornecedores[20][20]; 

    public void cadastrarFornecedor() {
        Fornecedores novoFornecedor = new Fornecedores();

        System.out.println("----------- Cadastro de Fornecedor -----------");
        System.out.print("Informe o ID do fornecedor: ");
        novoFornecedor.setCdFornecedor(ler.next());

        System.out.print("Informe o nome/Razão Social do fornecedor: ");
        novoFornecedor.setNomeRa(ler.next());

        System.out.print("Informe o CNPJ do fornecedor: ");
        novoFornecedor.setCnpj(ler.next());

        System.out.print("Informe o e-mail do fornecedor: ");
        novoFornecedor.setEmail(ler.next());

        System.out.print("Informe a senha do fornecedor: ");
        novoFornecedor.setSenha(ler.next());

        // Adicionar o fornecedor ao array 
        for (int i = 0; i < fornecedores.length; i++) {
            for (int j = 0; j < fornecedores[i].length; j++) {
                if (fornecedores[i][j] == null) {
                    fornecedores[i][j] = novoFornecedor;
                    System.out.println("\nFornecedor cadastrado com sucesso!\n");
                    return;
                }
            }
        }
        System.out.println("Não foi possível cadastrar o fornecedor. Limite de fornecedores atingido.");
    }

    public void exibirFornecedores() {
        System.out.println("\n--------- Lista de Fornecedores ---------");
        for (Fornecedores[] listafornecedor : fornecedores) {
            for (Fornecedores fornecedor : listafornecedor) {
                if (fornecedor != null) {
                	System.out.println("-----------------------------------------------");
                    System.out.println("ID: " + fornecedor.getCdFornecedor());
                    System.out.println("Nome/Razão Social: " + fornecedor.getNomeRa());
                    System.out.println("CNPJ: " + fornecedor.getCnpj());
                    System.out.println("E-mail: " + fornecedor.getEmail());
                    System.out.println("Senha: " + fornecedor.getSenha());
                    System.out.println("-----------------------------------------------");
                }
            }
        }
        System.out.println("------- Fim da Lista de Fornecedores -------\n");
    }
}

