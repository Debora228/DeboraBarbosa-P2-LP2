package Herança;

public class IngressoVIP extends Ingresso{

	private float valorAdicional;

	public IngressoVIP(float valorNormal, float valorAdicional) {
		super(valorNormal);
		this.valorAdicional = valorAdicional;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public float getValor() {
		return super.getValor() + this.valorAdicional;
	}
	
	@Override
	public String toString() {
		return "Valor com adicional: " + this.getValor();
	}
}
