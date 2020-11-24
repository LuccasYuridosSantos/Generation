package entities;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;

	public Fornecedor() {
		super();
	}

	public Fornecedor(String name, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(name, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}

	@Override
	public String toString() {
		return "Fornecedor: " + this.getName() + ", possui valor de Credito = R$ " + valorCredito + ", valorDivida = R$ "
				+ valorDivida + ", e saldo = R$ " + this.obterSaldo();
	}

}
