package controller;

public class Ex02Controller {
	
	public String binario(int n) {
		// Condição de parada caso n for menos que 2
		if (n < 2) {
			return Integer.toString(n);
		}
		//  Concatenar o resto da divisão de n por 2 com a chamada recursiva para n/2
		else {
			return binario(n/2) + Integer.toString(n%2);
		}

	}
	
}
