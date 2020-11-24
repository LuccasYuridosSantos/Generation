package entities;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;

	public Administrador() {
		super();
	}

	public Administrador(String name, String endereco, String telefone, double ajudaDeCusto) {
		super(name, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador: " + this.getName() + ", endereco=" + this.getEndereco() + ", telefone="
				+ this.getTelefone() + ", ajudade de custo = R$ " + this.getAjudaDeCusto();
	}

}
