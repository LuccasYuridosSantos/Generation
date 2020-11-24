package entities;

public class Vendedor extends Pessoa implements VencimentoBase {
	private double valorVendas;
	private double comissao;
	private double vencimentoBase;

	public Vendedor() {
		super();
	}

	public Vendedor(String name, String endereco, String telefone, double valorVendas, double comissao,
			double vencimentoBase) {
		super(name, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.vencimentoBase = vencimentoBase;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getvencimentoBase() {
		return vencimentoBase;
	}

	public void setvencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}

	@Override
	public void setVencimentoBase(double vencimentoBase, double valorVendas, double comissao) {
		this.setComissao(comissao);
		;
		this.setValorVendas(valorVendas);
		;
		this.vencimentoBase = vencimentoBase + (this.valorVendas * (this.comissao / 100.0));
	}

	@Override
	public String toString() {
		return "Vendedor:" + this.getName() + "  Conseguiu o valor de Vendas = R$ " + valorVendas
				+ ", e tem comissao = " + comissao + "%, vencimento Base = R$ " + String.format("%.2f", vencimentoBase);
	}

}
