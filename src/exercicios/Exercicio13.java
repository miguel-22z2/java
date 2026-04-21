package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para fazer seu fatorial:");
		int numero = teclado.nextInt();
		
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		System.out.println("Resultado: " + resultado);
		teclado.close();
	}
}
