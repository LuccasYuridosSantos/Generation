import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*3.	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
		 *  e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia
		 *   o número de maçãs compradas, calcule e escreva o valor total da compra.
		 *  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de maçãs compradas:  ");
		int macas = sc.nextInt();
		double valorCompra;
		
		System.out.println();
		if(macas < 12) {
			double valor = 0.30;
			valorCompra = macas * valor;
			System.out.println("O valor de cada maças foi de:R$ " + valor);
		}else {
			double valor = 0.25;
			valorCompra = macas * 0.25;
			System.out.println("O valor de cada maças foi de:R$ " + valor);
		}
		
		
		System.out.println("O valor total da compra:R$ "+ valorCompra);
		
		sc.close();
	}

}
