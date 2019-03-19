package Herança;

public class Empregado {
	private String nome;
	protected float salario;
	
	public Empregado(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return this.nome + ": " + this.salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
