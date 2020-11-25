package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.OperacaoEstoque;
import entities.Produto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> estoque = new ArrayList<Produto>();

		OperacaoEstoque op = new OperacaoEstoque();

		boolean cont = true;
		do {
			System.out.println("=========================================");
			System.out.println("|[1] Adicionar Produto ao estoque       |");
			System.out.println("|[2] Remover Produto ao estoque         |");
			System.out.println("|[3] Atualizar Produto ao estoque       |");
			System.out.println("|[4] Apresentar Produtos do estoque     |");
			System.out.println("=========================================\n");

			System.out.print("Informe a opção: ");
			int opc = sc.nextInt();
			switch (opc) {
			case 1: {
				op.adicionar(estoque);
				break;

			}
			case 2: {
				op.remover(estoque);
				break;

			}
			case 3: {
				op.atulizar(estoque);
				break;

			}
			case 4: {
				op.apresentarEstoque(estoque);
				break;
			}

			default:
				System.out.println("codigo inválido");
			}

			System.out.println("\n[1]Deseja finalizar operação || [2] Deseja realizar outra operação");

			int opr = sc.nextInt();
			if (opr == 1) {
				cont = false;
			}
			sc.nextLine();
		} while (cont);

		sc.close();
	}

}
