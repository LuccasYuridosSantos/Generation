import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		 *Infantil A = 5 a 7 anos
		 *Infantil B = 8 a 11 anos
		 *Juvenil A = 12 a 13 anos
		 *Juvenil B = 14 a 17 anos
		 *Adultos = Maiores de 18 anos 
		 */
		int idade;
		
		System.out.println("Informe a idade do nadador(a) : ");
		idade = sc.nextInt();
		
		System.out.println("A categoria do nadador:");
		if (idade >= 5 || idade <= 7) {
			System.out.println("Infantil A");
		} else if(idade >= 8 && idade < 12) {
			System.out.println("Infantil B");
		}else if(idade >= 12 && idade <14) {
			System.out.println("Juvenil A");
		}else if(idade >= 14 && idade < 18) {
			System.out.print("Juvenil B");
		}else {
			System.out.print("Adulto");
		}
		
		
		
		
		sc.close();
	}
}
