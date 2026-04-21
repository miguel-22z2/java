package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o 2º número:");
		int numero2 = teclado.nextInt();
		System.out.println("Digite o 3º número:");
		int numero3 = teclado.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O 1º número é maior!");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O 2º número é maior!");
		} else {
			System.out.println("O 3º número é maior!");
		}
		teclado.close();
	}
}
