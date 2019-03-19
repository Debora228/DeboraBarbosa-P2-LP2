package Encapsulamento;
public class Pessoa {
	private String nome;
	private String cpf;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade, String sobrenome) {
		this.nome = nome;
		this.cpf = cpf;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	public String  getNomeCompleto () {
		
		return this.nome + " " + this.sobrenome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
}
