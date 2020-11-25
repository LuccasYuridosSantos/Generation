package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Collection<Produto> estoque = new ArrayList<Produto>();
		boolean cont = true;
		
		do{
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
		if(opc == 2) {
			cont = false;
		}
		sc.nextLine();
		}while(cont);
		
		
		
	}

}
