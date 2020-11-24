package entities;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	private double vacimentoBase;
	
	public Operario() {
		super();
	}

	public Operario(String name, String endereco, String telefone, double valorProducao, double comissao) {
		super(name, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.vacimentoBase =(valorProducao*(comissao/100.0));
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		
		this.comissao = comissao;
	}
	
	public double getVacimentoBase() {
		
		return this.vacimentoBase;
	}

	public void setVacimentoBase(double valorProducao, double comissao) {
		this.setComissao(comissao);
		this.setValorProducao(valorProducao);
		this.vacimentoBase = (this.valorProducao*(this.comissao/100.0));
	}

	@Override
	public String toString() {
		return "Operario:"+this.getName() +" valorProducao=R$ " + valorProducao + ", comissao=" + comissao + "%, vacimentoBase=R$"
				+ vacimentoBase;
	}
	
	
}
