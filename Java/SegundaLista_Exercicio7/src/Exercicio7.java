import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
		 *  (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		 */
		
		double area, altura , base;
		
		System.out.println("-------------------Calcular área-------------");
		System.out.print("Informe a altura do triângulo: ");
		altura = sc.nextDouble();
		System.out.print("Informe a base do triângulo: ");
		base = sc.nextDouble();
		
		if(altura < 0  || base < 0) {
			System.out.println("Valores invalidos");
		}else {
			
			area = (base*altura)/2.0;
			System.out.println("Area do triângulo: " + area);
		}
		
		
		
		sc.close();
	}
}
