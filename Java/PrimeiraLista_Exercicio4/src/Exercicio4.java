import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
		 *  e mostre-o expresso em horas, minutos esegundos
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int tempoSec, horas, minutos, segundos;
		
		System.out.print("Digite o tempo total do evento na fabrica em segundo: ");
		tempoSec = sc.nextInt();
		
		
		horas = tempoSec/3600;
		minutos = (tempoSec%3600)/60;
		segundos =((tempoSec%3600)%60);
		
		
		 System.out.println("A duração do evento na fabrica foi ");
		 System.out.println("Em horas: " + horas);
		 System.out.println("Em minutos: "+ minutos);
		 System.out.println("Em segundos: "+ segundos);
		
		
		
		
		
		
		sc.close();
	}

}
