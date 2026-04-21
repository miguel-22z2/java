package exercicios;

import java.util.Random;

public class Exercicio33 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		for (int i = 1; i <= 100; i++) {
			int numeroDado = aleatorio.nextInt(6) + 1;
			System.out.println("Lançamento número " + i + ": " + numeroDado);
		}
	}
}
