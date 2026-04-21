package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número para fazer a soma de 1 até número:");
		int numero = teclado.nextInt();
		
		int resultado = 0;
		
		for (int i = 0; i <= numero; i++) {
			resultado += i;
		}
		System.out.println("Resultado: " + resultado);
		teclado.close();
	}
}
