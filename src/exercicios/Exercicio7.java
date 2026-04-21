package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = teclado.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O 1º número é maior!");
		} else {
			System.out.println("O 2º número é maior!");
		}
		teclado.close();
	}
}
