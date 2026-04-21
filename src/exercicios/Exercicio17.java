package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine().toLowerCase();
		String invertida = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			invertida += palavra.charAt(i);
		}
		
		if (invertida.equals(palavra)) {
			System.out.println("A palavra é um palíndromo!");
		} else {
			System.out.println("A palavra não é um palíndromo!");
		}
		teclado.close();
	}
}
