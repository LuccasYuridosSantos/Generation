import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2.	 Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
		 *  A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: 
		 * ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = 1234;
		System.out.print("Digite a senha: ");
		int senhaUsuario = sc.nextInt();
		 
		 if(senha == senhaUsuario) {
			 System.out.println("ACESSO PERMITIDO");
		 }else {
			 System.out.println("ACESSO NEGADO");
		 }
		
		
		sc.close();
	}

}
