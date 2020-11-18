package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*5-	Escrever um programa que receba vários números inteiros no teclado.
		 *  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		 *  (DO...WHILE)
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int num = 0, cont =0, soma =0;
		double media;

		System.out.println("Para sair do programa e mostra média dos multiplos de 3, digite 0");
		do {
			System.out.print("\nDigite um numero: ");
			num = sc.nextInt();
			if(num%3==0 && num != 0) {
				soma += num;
				cont++;
			}
			
			
		} while (num != 0);
		
		media = (double)soma/cont;
		
		System.out.println("\nA média dos valores multiplos de 3: "+ String.format("%.2f", media) );

		sc.close();

	}

}
