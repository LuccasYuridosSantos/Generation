import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1.Escreva um programa para ler 2 valores (considere que não serão informados valores iguais)
		 *  e escrever o maior deles.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		System.out.print("INforme um valor: ");
		n1 = sc.nextDouble();
		System.out.print("Informe outro valor: ");
		n2 =sc.nextDouble();
		
		System.out.println();
		if(n1 > n2) {
			System.out.println("O maior valor é : " + n1);
		}else {
			System.out.println("O maior valor é : "+ n2);
		}
		
		sc.close();
	}

}
