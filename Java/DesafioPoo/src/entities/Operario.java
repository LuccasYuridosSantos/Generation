package entities;

public class Operario extends Pessoa implements VencimentoBase{
	private double valorProducao;
	private double comissao;
	private double vencimentoBase;
	
	public Operario() {
		super();
	}

	public Operario(String name, String endereco, String telefone, double valorProducao, double comissao, double vencimentoBase) {
		super(name, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.vencimentoBase = vencimentoBase;
	}

	public double getValorProducao()  {
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
	
	public double getVencimentoBase() {
		
		return this.vencimentoBase;
	}

	@Override
	public void setVencimentoBase(double vencimentoBase, double valorProducao, double comissao) {
		this.setComissao(comissao);
		this.setValorProducao(valorProducao);
		this.vencimentoBase = vencimentoBase+(this.valorProducao*(this.comissao/100.0));
	}

	@Override
	public String toString() {
		return "Operario: "+this.getName() +", valorProducao=R$ " + valorProducao + ", comissao=" + comissao + "%, vacimentoBase=R$"
				+ vencimentoBase;
	}
	
	
}
