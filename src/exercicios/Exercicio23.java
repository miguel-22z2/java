package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio23 {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = numeroAleatorio.nextInt(100) + 1;
		}
		System.out.println("Array criado: " + Arrays.toString(array));
		
		int contadorPar = 0;
		
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] % 2 == 0) {
				contadorPar++;
			}
		}
		System.out.println("Números pares no Array: " + contadorPar);
	} 
}
