package exercicios;

import java.util.Arrays;

public class Exercicio27 {
	public static void main(String[] args) {
		int[] numeros = { 10, 20, 10, 30, 40, 20, 50 };
		int n = numeros.length;

		Arrays.sort(numeros);

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (numeros[i] != numeros[i + 1]) {
				temp[j++] = numeros[i];
			}
		}

		temp[j++] = numeros[n - 1];

		int[] resultado = new int[j];
		for (int i = 0; i < j; i++) {
			resultado[i] = temp[i];
		}

		System.out.println("Original: " + Arrays.toString(numeros));
		System.out.println("Sem duplicados: " + Arrays.toString(resultado));
	}
}
