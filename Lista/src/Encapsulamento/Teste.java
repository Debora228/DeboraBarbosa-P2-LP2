package Encapsulamento;
public class Teste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("Andre"); 
		agenda.adicionar("Andre", "amor amor");
		agenda.adicionar("Andre", "odio odio");
		agenda.adicionar("Andre", "agora");
		
		boolean a = agenda.remover(new Nota("Andre", "amor amor"));
		System.out.println(a);
		//Agenda agenda2 = new Agenda("Debora");
		//agenda2.adicionar("Andre", "odio odio");
		//agenda.finalizar("Andre", 0);
		//agenda.listarFalse("Andre");
		
		//agenda.remover("Andre", "amor amor");
	
	}

}
