import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		//6.	Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		double value1 = sc.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double value2 = sc.nextDouble();
		System.out.println("Informe o terceiro valor: ");
		double value3 = sc.nextDouble();
		
		if(value1 > value2 && value1 > value3 ) {
			System.out.println("O valor "+ value1 +" é o maior");
		}else if(value2 > value1 && value2 > value3) {
			System.out.println("O valor "+ value2 +" é o maior");
		}else {
			System.out.println("O valor "+ value3 +" é o maior"); 
		}
		

		sc.close();
	}

}
