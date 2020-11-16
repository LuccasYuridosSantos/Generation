import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
		 *  trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
		 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável
		 *  E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final 
		 * do processamento imprimir o salário total e o salário excedente. 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = 0, numeroHoras = 0, horasExc = 0;
		float salarioTotal = 0, salarioExc = 0 ;
		
		System.out.println("Informe o código do funcionario: ");
		codigo = sc.nextInt();
		System.out.println("Informe o numero de horas trabalhada: ");
		numeroHoras = sc.nextInt();
		
		if(numeroHoras > 50) {
			horasExc =(numeroHoras-50);
			salarioExc = horasExc*20;
			salarioTotal = salarioExc +(numeroHoras-horasExc)*10;
		}
		if(numeroHoras < 1) {
			System.out.println("Valor invalido!!");
		}
		else {
		System.out.println("O funcionario com código: " + codigo);
		System.out.println("Trabalho o total de horas : " + numeroHoras);
		System.out.println("Excedeu o horaio em: "+horasExc+ " horas");
		System.out.println("Seu salario total :R$ "+ salarioTotal);
		System.out.println("Salario extra devido ao excedente: R$ "+ salarioExc );
		}
		sc.close();
	}
}
