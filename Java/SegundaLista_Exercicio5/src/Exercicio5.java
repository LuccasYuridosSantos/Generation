import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias
		*que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
		*Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se 
		*o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
		*se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
		*Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes 
		*grupos de empresas.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float indice;
		
		System.out.println("Informe o indice da poluição: ");
		indice = sc.nextFloat();
		
		if(indice <= 0.25) {
			System.out.println("Índice de poluição aceitável");
		}else if(indice >= 0.3 && indice < 0.4){
			System.out.println("Indústrias do 1º grupo, devido ao indice de poluição será necessario suspenção das atividades");
		}else if(indice >= 0.4 && indice < 0.5 ) {
			System.out.println("Indústrias do 1º e 2º grupo, devido ao indice de poluição será necessario suspenção das atividades");
		}else {
			System.out.println("Todas as Indústrias, devido ao indice de poluição será necessario suspenção das atividades");
		}
		
		
		sc.close();
	}
}
