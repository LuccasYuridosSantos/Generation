package entities;

public class Produto {
	
	private String modelo;
	private String cod;
	private double valor;
	private int quantidade;
	
	public Produto() {
		super();
	}

	public Produto(String modelo, String cod, double valor, int quantidade) {
		super();
		this.modelo = modelo;
		this.cod = cod;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto modelo = " + modelo + ", cod = " + cod + ", valor = R$ " + valor + ", quantidade = " + quantidade ;
	}
	
	
	
	
}
