import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*exercício anterior
		 * 4. Escreva um programa para ler o número de lados de um polígono regular e a
		 * medida do lado (em cm). Calcular e imprimir o seguinte: − Se o número de
		 * lados for igual a 3 escrever TRIÂNGULO e o valor da área − Se o número de
		 * lados for igual a 4 escrever QUADRADO e o valor da sua área. − Se o número de
		 * lados for igual a 5 escrever PENTÁGONO.
		 */
		/*5 Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
		 *− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
		 *− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de lados do polígno: ");
		int side = sc.nextInt();

		if (side == 3) {
			System.out.println("\n----------- Triângulo -----------\n");
			System.out.print("informe a base do triângulo em cm: ");
			double base = sc.nextDouble();
			System.out.print("informe a altura do triângulo em cm: ");
			double height = sc.nextDouble();
			double area = (base * height) / 2;
			System.out.println("A área do triÂngulo = " + String.format("%.2f", area) + " cm²");
		} else if (side == 4) {
			System.out.println("\n----------- Quadrado -----------\n");
			System.out.print("Informe o lado do quadrado em cm: ");
			double sideSquare = sc.nextDouble();
			double area = sideSquare * sideSquare;
			System.out.println("A área do Quadrado = " + String.format("%.2f", area) + " cm²");
		} else if (side == 5) {
			System.out.println("\n----------- Pentágono -----------\n");
			System.out.print("Informe o lado do pentágono em cm: ");
			double sidePentagon = sc.nextDouble();
			System.out.print("informe a altura do pentágono em cm: ");
			double height = sc.nextDouble();
			double area = 5*sidePentagon * height;
			System.out.println("A área do Quadrado = " + String.format("%.2f", area) + " cm²");

		}else if(side < 3){
			System.out.println("NÃO É UM POLÍGONO");
		}else {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}

		sc.close();
	}

}
