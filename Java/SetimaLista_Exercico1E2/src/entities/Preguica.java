package entities;

public class Preguica extends Animal{
	private boolean dormindo;

	public Preguica() {
		super();
	}

	public Preguica(String name, int idade, boolean dormindo) {
		super(name, idade);
		this.dormindo = dormindo;
	}

	public boolean isDormindo() {
		return dormindo;
	}

	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("uuuuuuuuuuuuuuuuuuuuuh");
	}
	
	public void subirAvore() {
		System.out.println("subindo arvore beeeeeem devagar");
	}

	@Override
	public String toString() {
		return "Preguica: name ="+ this.getName()+", esta dormindo=" + dormindo+ ", Idade = " + getIdade();
	}
	
	
}
