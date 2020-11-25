package entities;

import java.util.List;
import java.util.Scanner;

public class OperacaoEstoque {
	Scanner sc = new Scanner(System.in);
	private boolean cont = true;

	public void adicionar(List<Produto> estoque) {
		do {
			System.out.println("Adicione produtos ao estoque:");
			System.out.print("Modelo: ");
			String modelo = sc.nextLine();
			System.out.print("Código do produto: ");
			String cod = sc.nextLine();
			System.out.print("Informe o valor do produto:R$ ");
			double valor = sc.nextDouble();
			System.out.println("Quantidade em estoque: ");
			int quantidade = sc.nextInt();
			estoque.add(new Produto(modelo, cod, valor, quantidade));

			System.out.println();

			System.out.println("Deseja adicionar mais  produtos ao estoque:");
			System.out.println("[1] Para continuar || [2] Para encerrar");
			int opc = sc.nextInt();
			if (opc == 2) {
				cont = false;
			}
			sc.nextLine();
		} while (cont);
	}

	public void remover(List<Produto> estoque) {
		do {
			System.out.println("\nDeseja excluir algum produto do estoque:");
			for (Produto produto : estoque) {
				System.out.println(produto);
			}
			System.out.println();
			System.out.println("Informe o codigo do produto pra remover do estoque: ");
			System.out.print("Código: ");
			String cod = sc.nextLine();
			for (int i = 0; i < estoque.size(); i++) {
				if (cod.equals(estoque.get(i).getCod())) {
					estoque.remove(estoque.get(i));
				}
			}

			System.out.println("\n[1] Para continuar || [2] Para encerrar");

			int opc = sc.nextInt();
			if (opc == 2) {
				cont = false;
			}
			sc.nextLine();
		} while (cont);

	}

	public void atulizar(List<Produto> estoque) {
		do {
			
			System.out.println("\nQual produto deseja atulizar do estoque: ");
			
			System.out.print("Informe o código do produto que deseja atualizar: ");
			String cod = sc.nextLine();
			for (int i = 0; i < estoque.size(); i++) {
				if (cod.equals(estoque.get(i).getCod())) {
					System.out.print("Modelo: ");
					String modelo = sc.nextLine();
					System.out.print("Código do produto: ");
					String codi = sc.nextLine();
					System.out.print("Informe o valor do produto:R$ ");
					double valor = sc.nextDouble();
					System.out.println("Quantidade em estoque: ");
					int quantidade = sc.nextInt();
					Produto produto = new Produto(modelo, codi, valor, quantidade);
					estoque.add(i, produto);
				}
			}
			System.out.println("\n[1] Para continuar || [2] Para encerrar");

			int opc = sc.nextInt();
			if (opc == 2) {
				cont = false;
			}
			sc.nextLine();
		} while (cont);

	}

	public void apresentarEstoque(List<Produto> estoque) {
		System.out.println("\nLista de produtos em estoque");
		for (Produto produto : estoque) {
			
			System.out.println(produto);
		}
		
	}

}
