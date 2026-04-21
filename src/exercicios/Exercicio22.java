package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio22 {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		int[] array = new int[10];

		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = numeroAleatorio.nextInt(100) + 1;
		}
		System.out.println("Array criado: " + Arrays.toString(array));

		float numero1 = array[0];
		float numero2 = array[1];
		float numero3 = array[2];
		float numero4 = array[3];
		float numero5 = array[4];
		float numero6 = array[5];
		float numero7 = array[6];
		float numero8 = array[7];
		float numero9 = array[8];
		float numero10 = array[9];
		
		System.out.println("Média do Array: " + (numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10) / 10);
	}
}
