package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println(" ------------ VOTAÇÃO ----------");
		System.out.println(" | [1] para votar em X         |");
		System.out.println(" | [2] para votar em Y	       |");
		System.out.println(" | [3] para votar em Z         |");
		System.out.println(" | [4] para votar em A         |");
		System.out.println(" | [5] para votar em B         |");
		System.out.println(" | [6] para não votar          |");
		System.out.println(" -------------------------------");

		System.out.print("\nInforme um numero: ");
		int voto = sc.nextInt();

		switch (voto) {
		case 1: {
			System.out.println("Você votou em X");
			break;
		}
		case 2: {
			System.out.println("Você votou em Y");
			break;
		}
		case 3: {
			System.out.println("Você votou em Z");
			break;
		}
		case 4: {
			System.out.println("Você votou em A");
			break;
		}
		case 5: {
			System.out.println("Você votou em B");
			break;
		}
		case 6: {
			System.out.println("Você não votou");
			break;
		}
		default:
			System.out.println("Voto invalido!!");
		}

		sc.close();
	}

}
