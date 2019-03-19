package Herança;

public class Main3 {

	public static void main(String[] args) {
		Fatorial f = new FatorialRecursivo();
		Fatorial f2 = new FatorialIterativo();
		System.out.println(f.calcular(5));
		System.out.println(f2.calcular(5));
	}

}
