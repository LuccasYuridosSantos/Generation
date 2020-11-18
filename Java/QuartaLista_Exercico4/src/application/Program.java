package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 4-Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int num = 0, soma = 0;

		System.out.println("Para sair do programa e mostra a soma, digite 0");
		do {
			System.out.print("\nDigite um numero: ");
			num = sc.nextInt();
			soma += num;
			
			
		} while (num != 0);
		
		System.out.println("\nA soma dos valores digitados: "+ soma);

		sc.close();

	}

}
