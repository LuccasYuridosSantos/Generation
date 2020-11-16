import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
		 *  e se é positivo ou negativo.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite o um numero: ");
		number =sc.nextInt();
		
		
		System.out.println();
		System.out.println("O numero: "+number);
		if(number >= 0) {
			System.out.print("É positivo ");
			if(number%2==0) {
				System.out.print("e Par.");
			}else {
				System.out.print("e Ímpar.");
			}
		}if(number < 0) {
			System.out.print("É negativo ");
			if(number%2==0) {
				System.out.print("e Par.");
			}else {
				System.out.print("e Ímpar.");
			}
		}
		
		sc.close();
	}
}
