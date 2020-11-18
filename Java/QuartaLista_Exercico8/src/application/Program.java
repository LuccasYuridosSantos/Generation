package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		 * apresente no final o total do somatório, a média e o total de valores lidos.
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver
		 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
		 * fornecer um valor negativo. (WHILE)
		 */

		Scanner sc = new Scanner(System.in);
		
		int cont =0;
		double num = 0.0,soma = 0.0, media =0.0;
	
		System.out.println("Para sair do programa digite um numero negativo!!\n");
		while(num>= 0) {
			System.out.print("\nDigite um valor: ");
			num = sc.nextDouble();
			
			if(num >= 0) {
				cont++;
				soma+= num;
			}
		}
		
		media = soma/cont;

		System.out.println("A somatória dos valore é: "+ soma);
		System.out.println("A média é igual à: "+ media);
		System.out.println("A quantidade de valores fornecidos foi igual à: "+ cont);
		
		sc.close();

	}

}
