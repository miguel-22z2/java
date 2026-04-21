package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio28 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = aleatorio.nextInt(100) + 1;
		}
		
		System.out.println("Array original: " + Arrays.toString(array));
		
		int temporario = 0;
		
		for (int i = 0; i < array .length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
            	if (array[j] < array[j + 1]) {
                    temporario = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporario;
                }
            }
        }
		
		System.out.println("Array rotacionado: " + Arrays.toString(array));
	}
}
