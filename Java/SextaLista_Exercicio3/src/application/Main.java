package application;

import entities.ProdutoEletronico;

public class Main {

	public static void main(String[] args) {
		/*
		 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
		 * referentes esta classe, em seguida crie um objeto produto eletrônico, defina
		 * as instancias deste objeto e apresente as informações deste objeto no
		 * console.
		 */
		
		
		ProdutoEletronico product1 = new ProdutoEletronico("Tv 23 polegadas", true, "Samsumg","TV");
		ProdutoEletronico product2 = new ProdutoEletronico();
		product2.setMarca("Accer");
		product2.setModelo("Notebook");
		product2.setTipo("Computador Pessoal");
		
		System.out.println(product1.status());
		System.out.println(product2.status());
		product1.desligar();
		product2.desligar();
		product2.ligar();
	}
}