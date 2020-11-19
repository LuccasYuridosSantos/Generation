package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
		 * programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
		 * determine e imprima a média aritmética dos lançamentos, contabilize e
		 * apresente também quantas foram as ocorrências da maior pontuação.
		 */

		Scanner sc = new Scanner(System.in);

		int maior = 0, cont = 0;
		double media = 0.0;
		int[] dado = new int[10];

		//Receber os valores do usuario
		System.out.println("Informe valor de 1 a 6!\n");
		for (int i = 0; i < dado.length; i++) {
			do {
				System.out.print("Digite o " + (i + 1) + "º valor do dado: ");
				dado[i] = sc.nextInt();
			} while ((dado[i] <= 0 || dado[i] > 6));

		}

		//Irá mostrar os valores dos lançamentos, e achar o maior valor do vetor
		System.out.print("\nOs valores dos lançamentos: ");
		for (int i : dado) {
			System.out.print(i + " ");
			if (maior < dado[i]) {
				maior = i;
			}
		}

		//irá contar a ocorrência do maior valor no vetor, e adicionar os valores dos lançamentos na media
		for (int i : dado) {
			if (i == maior) {
				cont++;
			}
			media += i;
		}
		
		//calcular a media
		media = media / dado.length;

		//imprimir a media e a ocorrência do maior valor
		System.out.println("A media dos valores: " + media);
		System.out.println("A ocorrencia da maior pontuação foi de: " + cont);

		sc.close();

	}

}
