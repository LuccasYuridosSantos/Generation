import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*3) Desenvolva um sistema em que:
		 *•Leia 4 (quatro) números;
		 *•Calcule o quadrado de cada um;
		 *•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		 *•Caso contrário, imprima os valores lidos e seus respectivos quadrados.	 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, number3, number4;
		double quad1, quad2, quad3, quad4;
		
		System.out.println("Digite o primeiro numero: ");
		number1 =sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		number2 =sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		number3 =sc.nextInt();
		System.out.println("Digite o quarto numero: ");
		number4 =sc.nextInt();
		
		quad1 = Math.pow(number1, 2);
		quad2 = Math.pow(number2, 2);
		quad3 = Math.pow(number3, 2);
		quad4 = Math.pow(number4, 2);
		
		if(quad3>=1000) {
			System.out.println("O quadrado de " + number3 +" é igual a = "+quad3);
		}else {
			System.out.println("O quadrado de " + number1 +" é igual a = "+quad1);
			System.out.println("O quadrado de " + number2 +" é igual a = "+quad2);
			System.out.println("O quadrado de " + number3 +" é igual a = "+quad3);
			System.out.println("O quadrado de " + number4 +" é igual a = "+quad4);
		}
		
		sc.close();
	}
}
