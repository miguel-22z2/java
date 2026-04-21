package exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		float peso = teclado.nextFloat();
		System.out.println("Digite sua altura:");
		float altura = teclado.nextFloat();
		float imc = peso / (altura * altura);
		System.out.println("Classificação do IMC:");
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal.");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso.");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau 1.");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau 2.");
		} else if (imc >= 40.0) {
			System.out.println("Obesidade Grau 3.");
		}
		teclado.close();
	}
}
