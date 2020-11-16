import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*8) Construa um sistema para ler uma variável numérica N e imprimi-la somente
		 * se a mesma for maior que 100, caso contrário imprimi-la com o valor zero. 
		*/
		
		double number;
		
		System.out.print("Digite um numero: ");
		number = sc.nextDouble();
		
		if(number > 100) {
			System.out.println("\nNumero digitado: "+number);
		}else {
			number =0.0;
			System.out.println("Number: " + number);
		}
		
		
		
		
		sc.close();
	}
}
