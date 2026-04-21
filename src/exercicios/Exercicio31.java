package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int inputNumero = 0;
		int numeroAleatorio = 0;
		
		while (true) {
			numeroAleatorio = aleatorio.nextInt(10) + 1;
			
			System.out.println("Pensei em um número entre 0 e 10...");
			System.out.print("Digite o número que eu pensei: ");
			inputNumero = teclado.nextInt();
			System.out.println();
			
			if (inputNumero == numeroAleatorio) {
				System.out.println("Parabéns! Você acertou!");
				break;
			} else {
				System.out.println("Vish... Tente novamente!");
				System.out.println();
			}
		}
		teclado.close();
	}

}
