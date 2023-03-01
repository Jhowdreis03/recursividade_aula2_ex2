package view;

import controller.Ex02Controller;

public class Ex02Principal {
	
	public static void main(String[] args) {
		//Instanciar a classe controller e criando um objeto
		Ex02Controller bi = new Ex02Controller();
		
		int n = 45;
		
		String resultado = bi.binario(n);
		System.out.println("O numero " + n + " em binarios é: " + resultado);
	}

}
