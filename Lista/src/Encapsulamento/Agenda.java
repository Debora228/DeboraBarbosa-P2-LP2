package Encapsulamento;

import java.util.List;
import java.util.Vector;

public class Agenda {
	private String donoAgenda;
	private	List<Nota> arrawNotas;
	
	public Agenda (String donoAgenda) {
		this.donoAgenda = donoAgenda;
		arrawNotas = new Vector<>();
	}	
	
	public void adicionar(String dono, String texto) {
		if (validarDono(dono)) {
				this.arrawNotas.add(new Nota(dono,texto));
		}
	}
	
	public boolean remover (Nota nota) {

		for(Nota n : this.arrawNotas) {
			if(n == nota) {
				return true;
				//System.out.println("Entrou");
				//this.arrawNotas.remove(n);
			}
		}
		return false;
	}
		/*
		if (validarDono(dono)) {
			String qi = arrawNotas[this.i].getTexto();
			//if (this.arrawNotas[i].getTexto().equals(texto)) {
			System.out.println(
					qi);
				
			//}
		}
	
	}
	
	public void listarTrue (String dono) {
		if (validarDono(dono)) {
			for (int i=0; i<10; i++) {
				if (null != this.arrawNotas(i)) {
					if (this.arrawNotas[i].isEstado()) {
						System.out.println(i + "- texto: " + this.arrawNotas[i].getTexto());
					}
				}
			}
		}
	}
	
	public void listarFalse (String dono) {
		
		if (validarDono(dono)) {
			for (int i=0; i<10; i++) {
				if (null != this.arrawNotas[i]) {
					if (!this.arrawNotas[i].isEstado()) {
						System.out.println(i + "- texto: " + this.arrawNotas[i].getTexto());
					}
				}
			}
		}
	}
	
	public void finalizar(String dono, int i) {
		if (validarDono(dono)) {
			for (int j=0; j<10; j++) {
				if(i == j) {
					this.arrawNotas[i].setEstado(false);
				}
			}
		}
	}
		*/
	public boolean validarDono(String donoNota) {
		if (donoNota.equals(this.donoAgenda)) {
			return true;
		}else {
			System.out.println("Inválido");
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
