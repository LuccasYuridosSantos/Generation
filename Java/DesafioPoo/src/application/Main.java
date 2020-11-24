package application;

import entities.Administrador;
import entities.Empregado;
import entities.Fornecedor;
import entities.Operario;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("You", "Sumaré", "999999999");

		System.out.println(pessoa);

		Fornecedor fornecedor = new Fornecedor("Edu", "Piracicaba", "99959995599", 10000.0, 5000.0);

		System.out.println(fornecedor);
		System.out.println("Saldo do fornecedor " + fornecedor.getName() + " saldo = R$ "
				+ String.format("%.2f", fornecedor.obterSaldo()));

		Empregado empregado = new Empregado("Carl", "Jatoba", "888888888", 1212, 1400, 15.0);

		System.out.println(empregado);
		System.out.println("Empregado " + empregado.getName() + ", codigo = " + empregado.getCodigoSetor()
				+ "salario com imposto =R$ " + String.format("%.2f", empregado.calcularSalario()));
		
		
		Administrador administrador= new Administrador("Antonio", "Campinas", "5555555555", 2000.00);
		
		System.out.println(administrador);
		
		Operario operario = new Operario("Guto", "Indaiatuba", "7777788888", 12000, 20);
		operario.setComissao(10);
		System.out.println(operario);

	}

}
