import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*1) João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de
		 *  São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você
		 *  faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver,
		 *   gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
		 *   Caso contrário mostrar tais variáveis com o conteúdo
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final float VALORMULTA = 4.00f;
		float peso = 0,  excesso = 0, multa = 0;
		
		System.out.println("Digite o peso total da Colheita de tomate: ");
		peso =sc.nextFloat();
		
		if(peso>50) {
			excesso = peso - 50;
			multa = excesso * VALORMULTA;
		}
		
		System.out.println("Peso da Colheita de tomate: " + peso +" KG");
		System.out.println("O excesso foi de "+ excesso +" KG");
		System.out.println("O valor da Multa foi de R$ "+multa);
		
		
		
		sc.close();
	}
}
