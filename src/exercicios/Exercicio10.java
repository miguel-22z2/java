package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = teclado.nextInt();
		
		if (numero >= 1) {
			System.out.println("O número é positivo!");
		} else if (numero <= -1) {
			System.out.println("O número é negativo!");
		} else if (numero == 0) {
			System.out.println("O número é 0!");
		}
		teclado.close();
	}
}
