package application;

import entities.Cliente;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta
		 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto
		 * e apresente as informações deste objeto no console.
		 */

		Cliente cliente = new Cliente("Antonio", 20, "ant@email.com", 99999999999L);

		Cliente cliente2 = new Cliente();

		cliente2.setName("Otavio");
		cliente2.setIdade(25);
		cliente2.setEmail("Ot@email.com");
		cliente2.setCpf(99999999998L);
		System.out.println(cliente + "\n" + cliente2);

	}
}
