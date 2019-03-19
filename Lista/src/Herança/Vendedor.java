package Herança;

public class Vendedor extends Empregado{
	private float percentualComissao;

	public Vendedor(String nome, float salario, float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}

	public float calcularSalario() {
		return super.getSalario() + (super.getSalario()*this.percentualComissao) ;
	}
	
	public String toString() {
		return super.toString() + "Salário c/ comissao: " + this.calcularSalario() + this.percentualComissao; 
	}
	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	
}
