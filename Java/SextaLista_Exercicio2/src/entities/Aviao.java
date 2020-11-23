package entities;

public class Aviao {
	private float comprimento;
	private float largura;
	private String modelo;
	private boolean voando;
	
	
	public Aviao() {
	}


	public Aviao(float comprimento, float largura, String modelo, boolean voando) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.modelo = modelo;
		this.voando = voando;
	}


	public float getComprimento() {
		return comprimento;
	}


	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}


	public float getLargura() {
		return largura;
	}


	public void setLargura(float largura) {
		this.largura = largura;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isVoando() {
		return voando;
	}


	public void setVoando(boolean voando) {
		this.voando = voando;
	}
	
	public void status() {
		System.out.println("Avião: "+ this.getModelo());
		System.out.println("Comprimento: "+ this.getComprimento());
		System.out.println("Largura: "+this.getLargura());
		if(isVoando()) {
			System.out.println("Está voando");
		}else {
			System.out.println("Não está voando");
		}
		
	}
	
}
