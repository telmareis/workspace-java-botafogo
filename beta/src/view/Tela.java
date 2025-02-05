package view;

import java.util.List;
import java.util.Scanner;

import model.Tarefa;

public class Tela {
	public void exibirMenu() {
		System.out.println("----- MENU PRINCIPAL -----");
		System.out.println("1 - Inclusão de tarefa");
		System.out.println("2 - Consulta de tarefa");
		System.out.println("3 - Alteração de tarefa");
		System.out.println("4 - Exclusão de tarefa");
		System.out.println("9 - Carga de dados de teste");
		System.out.println("0 - F  I  M");
		System.out.println("Digite a opção desejada:");
	}
	
	public Tarefa exibirInclusao (int indice) {
		Scanner teclado = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		tarefa.setId(indice);
		System.out.println("I N C L U S Ã O");
		System.out.println("Descrição : ");
		tarefa.setDescricao(teclado.nextLine());
		System.out.println("Prazo : ");
		tarefa.setPrazo(teclado.nextInt());
		System.out.println("Finalizada (S/N)? ");
		String status = teclado.next();
		
		if(status.equals("S") || status.equals("s")) {
			tarefa.setFinalizada(true);	
		} else {
			tarefa.setFinalizada(false);
		}
		
		return tarefa;
	}
	
	public void exibirTarefa(List<Tarefa> tarefas) {
		System.out.println("C O N S U L T A");
		
		for(Tarefa item: tarefas) {
		System.out.println(item);
		System.out.println("--------------------------------------------");
		
		}
	}
	
	public Tarefa exibirAlteracao(Tarefa tarefa) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("A L T E R A Ç Ã O");
		System.out.println("Descrição : ");
		tarefa.setDescricao(teclado.nextLine());
		System.out.println("Prazo : ");
		tarefa.setPrazo(teclado.nextInt());
		System.out.println("Finalizada (S/N)? ");
		String status = teclado.next();
		
		if(status.equals("S") || status.equals("s")) {
			tarefa.setFinalizada(true);	
		} else {
			tarefa.setFinalizada(false);
		}
	}
	       } else {
			System.out.println("Opção inválida");
		
        }
        
		return tarefa;
	}
	
	public List<Tarefa> exibirExclusao(List<Tarefa> tarefas) {
		exibirTarefa(tarefas);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Deseja excluir qual tarefa?");
		int busca = scanner.nextInt();
		
		for(Tarefa tarefa: tarefas) {
			if(tarefa.getId() == busca) {
				registro = tarefa);
			}
		}
		
		tarefas remove
	}
		System.out.println("Tarefa excluída!");
		
		return tarefas;
	}
}
