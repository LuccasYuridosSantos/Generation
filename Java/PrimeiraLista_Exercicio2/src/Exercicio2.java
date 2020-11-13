import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem
		 *  do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a 
		 *  percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema 
		 *  que leia o custo de fábrica de um carro e escreva o custo ao consumidor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final float porImp = 0.45f, porDist = 0.28f;
		
		float custoFabri, custoConsu;
		
		
		System.out.print("Informe o valor do custo de fabrica de um carro novo: R$ ");
		custoFabri = sc.nextFloat();
		
		
		custoConsu = custoFabri + (custoFabri*porImp )+(custoFabri*porDist);
		
		System.out.println("O custo do consumidor é: R$ "+ custoConsu);
		
		sc.close();
	}
}
