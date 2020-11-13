import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		
		int totaisDias, ano, mes, dia;
		
		System.out.println("-----------------------------Informe sua idade---------------------------");
		System.out.print("Informe sua idade em dias: ");
		totaisDias =sc.nextInt();
		
		ano = totaisDias/365;
		mes = (totaisDias%365)/30;
		dia = (totaisDias%365)%30;
		
		System.out.println("\nSua idade:");
		System.out.println("Anos: " + ano );
		System.out.println("Meses: "+ mes);
		System.out.println("Dias: "+ dia);
		
		
		
		sc.close();
	}

}
