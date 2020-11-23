package application;

import entities.Aviao;

public class Main {

	public static void main(String[] args) {
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta
		 * classe, em seguida crie um objeto avião, defina as instancias deste objeto e
		 * apresente as informações deste objeto no console.
		 */
		
		Aviao aviao = new Aviao(20f, 10f, "Bimotor", false);
		Aviao aviao2 = new Aviao(15f,12f, "Aero modelo", true);
		
		aviao.status();
		System.out.println();
		aviao2.status();

	}
}
