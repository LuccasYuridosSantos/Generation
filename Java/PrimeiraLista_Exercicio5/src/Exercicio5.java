import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/* Faça um sistema que leia a idade de uma pessoa expressa em anos,
		 *meses e dias e mostre-a expressa apenas em dias.		 * 
		 */
		Scanner sc= new Scanner(System.in);
		
		int anos, meses, dias, diasTotais;
		System.out.println("-----------------------Informe sua idade--------------------------");
		System.out.print("Digite quantidade de anos:  ");
		anos = sc.nextInt();
		System.out.print("Digite quantidade de meses: ");
		meses = sc.nextInt();
		System.out.print("Digite quantidade de dias:  ");
		dias = sc.nextInt();
		
		diasTotais = (anos*365)+(meses*30)+dias;
		
		System.out.println("\nTotal de dias: " + diasTotais);
		
		
		
		
		
		
		sc.close();
	}

}
