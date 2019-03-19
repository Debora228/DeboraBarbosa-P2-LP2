package Herança;

public class FatorialRecursivo implements Fatorial{
	public int calcular(int n) {
		if(n==1) {
			return 1;
		}
		
		return n * calcular(n-1);
	}
}
