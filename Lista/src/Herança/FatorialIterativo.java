package Herança;

public class FatorialIterativo implements Fatorial{
	public int calcular (int n) {
		int fat = 1;
		
		for(int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		return fat;
	}
}
