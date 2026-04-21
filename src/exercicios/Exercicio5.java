package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a temperatura em Cº:");
		double celcius = teclado.nextInt();
		double conversao = (celcius * 1.8) + 32;
		System.out.println(celcius + "Cº em Fº é: " + conversao + "Fº");
		teclado.close();
	}
}
