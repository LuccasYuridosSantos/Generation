package entities;

public class ProdutoEletronico {

	private String modelo;
	private Boolean ligado;
	private String marca;
	private String tipo;

	public ProdutoEletronico() {
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

	public void setLigado(Boolean ligado) {
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

	public String status() {
		return "O produto: " + this.getModelo()
				+"\nMarcar: "+ this.getMarca() 
				+"\nTipo: " + this.getTipo()
				+"\nEstá Ligado: "+this.getLigado()+"\n";
	}

}
