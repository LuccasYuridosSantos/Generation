package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 * 
		 * 
        */
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		System.out.println("Caso deseje sair do programa digite -99\n");
		
		while(idade != -99) {
			System.out.print("\nInforme a idade: ");
			idade =sc.nextInt();
			
			if(idade>0 && idade <21) {
				menor++;
			}else if(idade > 50) {
				maior++;
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menor);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior);
		
		
		sc.close();
		
	}

}
