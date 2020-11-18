package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)9
        */
		
		Scanner sc = new Scanner(System.in);
		
		int num ,par=0, impar=0;
		
		for(int i =0;i<10;i++) {
			System.out.print("\ninforme um numero: ");
			num = sc.nextInt();
			if(num%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Quantidade de numeros pares: "+par);
		System.out.println("Quantidade de numeros impares: "+impar);
		sc.close();
		
	}

}
