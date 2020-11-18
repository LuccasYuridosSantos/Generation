package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto
		 *dos números de 1 até 500. (FOR)
		*/
		Scanner sc = new Scanner(System.in);
		
		int soma = 0; 
		
		
		for (int i = 1; i <500; i++) {
			
			System.out.println(i);
			if(i%3==0) {
				if(i%2 != 0) {
					System.out.println(i);
					soma += i;
				}
			}
		}
		
		System.out.println("O valor da soma dos numeros multiplos de 3 e impares é igual à: "+ soma);
		sc.close();

	}

}
