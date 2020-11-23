package entities;

public class Cliente {
	
	private String name;
	private int idade;
	private String email;
	private long cpf;
	
	
	public Cliente() {
	}


	public Cliente(String name, int idade, String email, long cpf) {
		this.name = name;
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Nome do cliente: " + name + ", idade: " + idade + ", email: " + email + ", CPF: " + cpf ;
	}
	
	
	
	
	
}
