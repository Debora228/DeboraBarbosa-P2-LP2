package Encapsulamento;
public class Agenda {
	private String donoAgenda;
	private	Nota[] arrawNotas;
	private int i = 0;
	
	public Agenda (String donoAgenda) {
		this.donoAgenda = donoAgenda;
		arrawNotas = new Nota[10];
	}	
	
	public void adicionar(String dono, String texto) {
		if (validarDono(dono)) {
			if (i < 10) {
				arrawNotas[i] = new Nota(dono,texto);
				i = i + 1;
			}
		}
	}
/*
	public void remover (String dono, int i) {
		
	}
	*/
	public void listarTrue (String dono) {
		for (int i=0; i<10; i++) {
			if (null != this.arrawNotas[i]) {
				if (this.arrawNotas[i].isEstado()) {
					System.out.println(i + "- texto: " + this.arrawNotas[i].getTexto());
				}
			}
		}
	}
	
	public boolean validarDono(String donoNota) {
		if (donoNota.equals(this.donoAgenda)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getDonoAgenda() {
		return donoAgenda;
	}

	public void setDonoAgenda(String donoAgenda) {
		this.donoAgenda = donoAgenda;
	}
	
	
}
