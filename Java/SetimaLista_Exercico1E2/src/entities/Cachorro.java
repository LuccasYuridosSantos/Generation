package entities;

public class Cachorro  extends Animal implements Correr{
	
	private String raca;
	
	public Cachorro() {
		super();
	}

	public Cachorro(String name, int idade, String raca) {
		super(name, idade);
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au au Au");
	}

	@Override
	public void correr() {
		System.out.println("Correndo igual a um dog");
		
	}

	@Override
	public String toString() {
		return "Cachorro:  nome =  "+this.getName()+", raca = " + raca + ", idade = "+ this.getIdade();
	}
	
	
}
