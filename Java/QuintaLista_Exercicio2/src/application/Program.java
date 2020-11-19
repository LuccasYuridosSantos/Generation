package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 */
		Scanner sc = new Scanner(System.in);

		int[][] n1 = new int[4][6], n2 = new int[4][6], m1 = new int[4][6], m2 = new int[4][6];

		// Capturar os valores do usuario par matriz n1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("\nInforme um valor para N1[" + (i + 1) + "][" + (j + 1) + "] : ");
				n1[i][j] = sc.nextInt();
			}
		}

		// Capturar os valores do usuario par matriz n2
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("\nInforme um valor para N2[" + (i + 1) + "][" + (j + 1) + "] : ");
				n2[i][j] = sc.nextInt();
			}
		}

		// calcular em m1 a soma dos elementos de mesma posição da matriz n1 e n2
		// calcular em m1 a diferença dos elementos de mesma posição da matriz n1 e n2
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
			}
		}

		// apresentar o matriz m1
		System.out.println("\nMatriz M1:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		// apresentar o matriz m2
		System.out.println("\nMatriz M2:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
