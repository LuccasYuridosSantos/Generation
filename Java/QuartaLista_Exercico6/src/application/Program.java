package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 *coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		 *  a) média do salário da população; 
		 *  b) média do número de filhos; 
		 *	c) maior salário; 
		 *	d) percentual de pessoas com salário até R$100,00.  (FOR)
		*/

		Scanner sc = new Scanner(System.in);
		
		int qtdFilhos = 0, cont = 0, pessoas ;
		double salario = 0.0,somaSal=0.0 ,mediaSal =0.0, mediaFilhos=0.0, maiorSal =0.0, perSalario;
		
		for(pessoas = 0 ; pessoas < 20; pessoas++) {
			System.out.print("Informe o salario da " +(pessoas+1)+" º pessoa: ");
			salario = sc.nextDouble();
			
			somaSal += salario;
			if (salario > maiorSal) {
				maiorSal = salario;
			}
			if(salario<= 100.0) {
				cont++;
			}
			System.out.print("Informe o quantidade de filhos da " +(pessoas+1)+" º pessoa: ");
			qtdFilhos += sc.nextInt();
			
		}
		
		mediaSal = (double)somaSal/pessoas;
		mediaFilhos = (double)qtdFilhos/pessoas;
		perSalario = (double)cont/pessoas*100.0;
		
		
		System.out.println("\nA média salarial da população:R$ "+ mediaSal);
		System.out.println("A média de números de filhos: "+ mediaFilhos);
		System.out.println("O maior salario é de:R$ "+maiorSal);
		System.out.println("O percentual de pessoas que recebem até R$ 100,00 é de: "+perSalario+"%");
		
		sc.close();

	}

}
