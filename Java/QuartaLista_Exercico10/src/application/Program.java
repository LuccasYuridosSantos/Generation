package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 10- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
		 * estiver. (DO...WHILE)
		 */
		Scanner sc = new Scanner(System.in);

		int num = 233;
		do {
			if(num <400 && num > 300) {
				num = num+3;
			}else {
				
				num+=5;
			}
			
			System.out.println(num);
		}while(num < 456);
		sc.close();

	}

}
