import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
		 * D= (R +S)/2
		 * R=(A+B)²
		 * S=(B+C)²
		 */		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int a, b,c;
		float d;
		System.out.print("Informe o primeiro numero inteiro: ");
		a =sc.nextInt();
		System.out.print("Informe o segundo numero inteiro: ");
		b = sc.nextInt();
		System.out.print("Informe o terceiro numero inteiro: ");
		c = sc.nextInt();
		
		d = (float) ((Math.pow((a+b), 2)+(Math.pow((b+c), 2)))/2);
		
		
		System.out.println("\nResultado da expressão: "+ d);
		
		
		
		sc.close();
	}

}
