package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		float numero1 = teclado.nextFloat();
		System.out.println("Digite o 2º número:");
		float numero2 = teclado.nextFloat();
		System.out.println("Digite o 3º número:");
		float numero3 = teclado.nextFloat();
		float mediaNumeros = (numero1 + numero2 + numero3) / 3;
		System.out.println("Média: " + mediaNumeros);
		teclado.close();
	}
}
