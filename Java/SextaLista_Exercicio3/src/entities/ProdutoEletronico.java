package entities;

public class ProdutoEletronico {

	private String modelo;
	private Boolean ligado;
	private String marca;
	private String tipo;

	public ProdutoEletronico() {
		this.ligado= false;
	}

	public ProdutoEletronico(String modelo, Boolean ligado, String marca, String tipo) {
		this.modelo = modelo;
		this.ligado = ligado;
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getLigado() {
		return ligado;
	}

	private void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void ligar() {
		if (!(this.getLigado())) {
			this.setLigado(true);
			System.out.println(this.getModelo() + " está ligando.");
		} else {
			System.out.println(this.getModelo() + " já está ligado.");
		}
	}

	public void desligar() {
		if (this.getLigado()) {
			this.setLigado(false);
			System.out.println(this.getModelo() + " está desligando.");
		} else {
			System.out.println(this.getModelo() + " já está desligado.");
		}
	}

	public String status() {
		return "O produto: " + this.getModelo() + "\nMarcar: " + this.getMarca() + "\nTipo: " + this.getTipo()
				+ "\nEstá Ligado: " + this.getLigado() + "\n";
	}

}
