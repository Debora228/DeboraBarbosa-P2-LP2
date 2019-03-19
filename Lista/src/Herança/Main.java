package Herança;

public class Main {

	public static void main(String[] args) {
		
		Ingresso nor = new Ingresso(5);
		IngressoVIP vip = new IngressoVIP(nor.getValor(), 2);
		
		System.out.println(vip);
		
		System.out.println(vip.getValor());
		
		System.out.println("valor normal: " + nor.getValor());
	}

}
