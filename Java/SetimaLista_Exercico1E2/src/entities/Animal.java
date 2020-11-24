package entities;

public class Animal {
	private String name;
	private int idade;
	
	public Animal() {
		super();
	}


	public Animal(String name, int idade) {
		super();
		this.name = name;
		this.idade = idade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void emitirSom() {
		System.out.println("Som do animal");
	}
	
	
}
