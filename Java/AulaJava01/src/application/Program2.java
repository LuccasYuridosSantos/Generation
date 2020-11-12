package application;

public class Program2 {

	public static void main(String[] args) {
		
		
		String hobbies[]= new String[5];
		
		String sobreMim = "Sou um pouco reservado, gosto de coonhecer novos lugares, ajudadr pessoas e me sentir util.";
		String sobreMim2 ="Gosto de passar meu tempo com minha familia e meus amigos, adoro me sentir desafiado, e sempre procuro aprender novas coisas"; 
		
		hobbies[0] = "Adoro asssitir animes";
		hobbies[1] = "Gosto de jogar";
		hobbies[2] = "Assitir series";
		hobbies[3] = "Ler mangás e HQs";
		hobbies[4] = "Estudar";
		
		
		System.out.println(sobreMim);
		System.out.println(sobreMim2);
		
		System.out.println("\nAlguns dos meus hobbies: ");
		for (int i = 0;  i< hobbies.length; i++) {
			System.out.println(hobbies[i]+";");
		}
	}

}
