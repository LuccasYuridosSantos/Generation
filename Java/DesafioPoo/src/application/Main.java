package application;

import java.util.ArrayList;
import java.util.List;

import entities.Administrador;
import entities.Empregado;
import entities.Fornecedor;
import entities.Operario;
import entities.Pessoa;
import entities.Vendedor;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("You", "Sumaré", "999999999");
		Fornecedor fornecedor = new Fornecedor("Edu", "Piracicaba", "99959995599", 10000.0, 5000.0);
		Empregado empregado = new Empregado("Carl", "Jatoba", "888888888", 1212, 1400, 15.0);
		Administrador administrador= new Administrador("Antonio", "Campinas", "5555555555", 2000.00);
		Operario operario = new Operario("Guto", "Indaiatuba", "7777788888", 12000, 20, 1000);
		Vendedor vendedor = new Vendedor("Aug", "Elias Fausto", "555599988", 30000, 10, 1200);
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		list.add(pessoa);
		list.add(fornecedor);
		list.add(empregado);
		list.add(administrador);
		list.add(operario);
		list.add(vendedor);
		
		for (Pessoa pessoa2 : list) {
			System.out.println();
			System.out.println(pessoa2);
		}
		
		
		
		

	}

}
