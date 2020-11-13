import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1.Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
		 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		final int peso1 = 2, peso2 =3, peso3 =5;
		
		int nota1, nota2, nota3;
		System.out.println("Sistema para calcular média ponderada do aluno");
		System.out.print("Informe a primeira nota: ");
		nota1 =sc.nextInt();
		System.out.print("\nInforme a segunda nota: ");
		nota2 = sc.nextInt();
		System.out.print("\nInforme a terceira nota: ");
		nota3 = sc.nextInt();
		
		
		 float mediaPond = (float)(peso1*nota1+peso2*nota2+peso3*nota3)/(peso1+peso2+peso3);
		
		System.out.println();
		System.out.println("A média deste aluno foi: " + mediaPond);
		
		
		sc.close();
	}

}
