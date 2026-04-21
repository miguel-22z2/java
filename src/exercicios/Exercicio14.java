package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = teclado.nextInt();
		
		boolean ePrimo = true;
		
		if (numero <= 1) {
			ePrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i != 0) {
					ePrimo = true;
					break;
				}
				ePrimo = false;
			}
		}
		if (ePrimo) {
			System.out.println("O número é primo!");
		} else {
			System.out.println("O número não é primo!");
		}
		teclado.close();
	}
}
