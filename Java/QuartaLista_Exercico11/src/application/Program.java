package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 11- Faça um programa que pegue um número do teclado e calcule a soma de todos
		 * os números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28,
		 * pois 1+2+3+4+5+6+7=28. .(DO...WHILE)
		 */

		Scanner sc = new Scanner(System.in);

		int soma = 0, cont = 0, num = 0;
		do {
			System.out.println("Informe um numero maior que zero!!");

			System.out.print("Digite um numero: ");
			num = sc.nextInt();
		} while (num <= 0);
		do {
			cont++;
			if (cont == num) {
				System.out.print(cont);
			} else {
				System.out.print(cont + " + ");
			}
			soma += cont;

		} while (cont < num);

		System.out.print(" = " + soma);
		sc.close();

	}

}
