package exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		int[] array = new int[10];
		
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = numeroAleatorio.nextInt(100) + 1;
		}
		
		System.out.println("Array criado: " + Arrays.toString(array));
		System.out.print("Digite um número para verificar se ele existe no Array: ");
		int numero = teclado.nextInt();
		
		boolean numeroEncontrado = true;
		
		for (int i = 0; i <= array.length - 1; i++) {
			if (numero == array[i]) {
				System.out.println(' ');
				System.out.println("Número encontrado no endereço " + i + " do Array.");
				numeroEncontrado = true;
				break;
			} 
			numeroEncontrado = false;
		}
		
		if (numeroEncontrado == false) {
			System.out.println();
			System.out.println("Número não encontrado!");
		}
		teclado.close();
	}
}
