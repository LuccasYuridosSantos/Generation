package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 9- Obtenha um número digitado pelo usuário e repita a operação de multiplicar
		 * ele por três (imprimindo o novo valor) até que ele seja maior do que 100.
		 * Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência:
		 * 5 15 45 135. (WHILE)
		 */

		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.println("Entre com um numero menor que 100");
		System.out.print("Digite um numero: ");
		num = sc.nextInt();
		while (!(num < 100) || num <= 0) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
		}

		while (num < 100) {
			
			System.out.print(" "+num);
			num = num*3;
		}
		System.out.print(" "+num);
		sc.close();

	}

}
