package Encapsulamento;

public class Conta {
	private int numeroConta;
	private double saldo;
	
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void deposita(int numeroConta, double valor) {
		if (validarConta(numeroConta)) {
			this.saldo = this.saldo + valor;
		}
	}
	
	public void saque(int numeroConta, double valor) {
		if (validarConta(numeroConta)) {
			if(validarSaque(valor)) {
				this.saldo = this.saldo - valor;
			}
		}
	}
	
	private boolean validarSaque (double valor) {
		if (this.saldo >= valor) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean validarConta (int numeroConta) {
		if(this.numeroConta == numeroConta) {
			return true;
		}else {
			return false;
		}
	}
	
}
