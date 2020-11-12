package application;

public class Program {
	public static void main (String[] args) {
		
		String mentalidades[] = new String[3];
		String habilidades[] = new String[2];
		
		mentalidades[0] = "Mentalidade de persistência.";
		mentalidades[1] = "Mentalidade de mentalidade de crescimento.";
		mentalidades[2] = "Mentalidade de responsabilidade pessoal.";
		habilidades[0] = "Habilidade de atenção ao detalhes";
		habilidades[1] = "Habilidade de comunicação";
		
		System.out.println("As mentalidades que me ajudaram a chegar onde estou desejo melhorar: ");
		for (int i = 0; i < mentalidades.length; i++) {
			System.out.println(mentalidades[i]);
		}
		System.out.println("\nAs habilidades que me ajudaram a chegar onde estou e desejo melhorar: ");
		for (int i = 0; i < mentalidades.length; i++) {
			System.out.println(mentalidades[i]);
		}
	}
}
