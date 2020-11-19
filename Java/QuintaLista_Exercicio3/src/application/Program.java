package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Exercício POO
		 * 
		 * Descreva em no máximo 200 palavras o que é um automóvel, uma pessoa e uma
		 * casa e o que eles fazem. Liste os substantivos e verbos separadamente. Cada
		 * substantivo corresponde a um objeto que precisará ser construído para
		 * implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos que
		 * você listou e, para cada um, liste vários atributos e comportamentos.
		 * Descreva brevemente como esses objetos interagem entre si e com outros
		 * objetos na sua descrição. Estes passos que você seguiu são típicos do projeto
		 * orientado a objetos.
		 */
		
		
		String automovel ="Um automovel é um veiculo que possui cor, modelo, placa, tipo de combustível, numero de chassi e fabricante, tipo de motor;\n onde ele pode  parar, em movimentar, acelerar e frear e ";
		String pessoa = "Uma pessoa é um ser vivo que tem nome, idade, sexo, altura, peso , e pode  dormindo, acordada, se alimentando, pensar, andar, descansar";
		String casa ="Casa é um edifício de tamanho e formas variadas, tendo quantidade de comodos, tamanho, pessoas que residem, cor, tipo, e ";
		
		String   relacionamento ="O relacionamento entre uma pessoa em um carro é de que uma pessoa possui ou não um ou vários carros;\r\n" + 
				"e dentro de um carro pode ter nenhuma ou várias pessoas dentro dele;\r\n" + 
				"uma pessoa pode ter nenhuma ou várias casas; em uma casa pode ter nenhuma ou varias pessoas.\r\n";
		
		System.out.println("\nAutomovel: "+automovel);
		System.out.println("\nPessoa: "+pessoa);
		System.out.println("\nCasa: "+casa);
		System.out.println("\nRelacionamento:"+relacionamento);
		
	}

}
