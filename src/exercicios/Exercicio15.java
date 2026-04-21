package exercicios;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.next().toLowerCase();
		int vogais = 0;
		
		for (int i = 0; i <= palavra.length() - 1; i++) {
			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
				vogais++;
			}
		}
		System.out.println("A palvra tem " + vogais + " vogais!");
		teclado.close();
	}
}
