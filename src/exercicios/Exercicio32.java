package exercicios;

import java.util.Random;

public class Exercicio32 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(1000) + 1;
		
		System.out.println("Número gerado: " + numero);
	}
}
