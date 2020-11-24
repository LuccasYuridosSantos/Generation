package entities;

public class Cavalo  extends Animal implements Correr{
	private String porte;

	public Cavalo() {
		super();
	}
	
	public Cavalo(String name, int idade, String porte) {
		super(name, idade);
		this.porte = porte;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("hinn in in");
	}

	@Override
	public void correr() {
		System.out.println("Correndo como um cavalo");
		
	}

	@Override
	public String toString() {
		return "Cavalo: porte=" + porte + ", nome = " + this.getName() + ", Idade = " + this.getIdade();
	}
	
	

}
