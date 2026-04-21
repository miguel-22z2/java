package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para ver sua tabuada:");
		int numero = teclado.nextInt();
		System.out.println(' ');
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + "x" + i + " = " + (numero * i));
		}
		teclado.close();
	}
}
