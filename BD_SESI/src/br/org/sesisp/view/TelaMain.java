package br.org.sesisp.view;

import java.util.Scanner;

import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) throws Exception {
	/* instanciar um obj da classe CruDao
		CrudDAO inserir_aluno = new CrudDAO();
		
//		instanciar um obj aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("australiano");
		aluno1.setIdade(58);
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		//**********************************************
		//Atualizar valores
		aluno1.setIdade(60);
		aluno1.setNome("Marcelo MIchael Jordan");
		aluno1.setRa(1);
		inserir_aluno.update(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		//************************************************
		//ler tabela de alunos do BD
		System.out.println("lendo lista...");
		for(Aluno olho : inserir_aluno.read()) {
			System.out.println("Dados do aluno: "  + olho.getRa() + " " + olho.getNome() +" " +  olho.getIdade());
		}
		//*********************************************************************************************
		//excluir dados
		CrudDAO remover_aluno = new CrudDAO();
		remover_aluno.delete(5);*/
		
		// SwitchCase
		
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno_1 = new Aluno();
		int op;
		Scanner entrada = new Scanner(System.in);
		do {
			ExibirMenu();
		op=entrada.nextInt();
		switch(op) {
		
		case 1:
			System.out.println("Digite o nome do aluno: ");
			String nome = entrada.next();
			aluno_1.setNome(nome);
			System.out.println("Digite a idade do aluno: ");
			int idade = entrada.nextInt();
			aluno_1.setIdade(idade);
			inserir_aluno.create(aluno_1);
			System.out.println("Nome: " + aluno_1.getNome() + "\nIdade: " + aluno_1.getIdade());
			break;
			
		case 2:
			
			aluno_1.setNome("Nicolas");
			aluno_1.setIdade(22);
			aluno_1.setRa(17);
			inserir_aluno.update(aluno_1);
			System.out.println("Nome: " + aluno_1.getNome());
			System.out.println("Idade: " + aluno_1.getNome());
			break;
			
		case 3:
			for (Aluno pr : inserir_aluno.read()) {
				System.out.println("Nome: " + pr.getNome()  + "\n" + "Idade: " + pr.getIdade() + 
						"\n" + "RA: " + pr.getRa());
		}	
		case 4:
			CrudDAO remover_aluno = new CrudDAO();
			remover_aluno.delete(6);
		default:
			break;
		}
		}while (op!=0);
	}
		private static void ExibirMenu() {
			System.out.println("Selecione uma opcao:");
			System.out.println("1- Adicione um aluno");
			System.out.println("2- Atualizar");
			System.out.println("3- Visualizar");
			System.out.println("4- Deletar");
			System.out.println("o- Sair");
		}
	}
