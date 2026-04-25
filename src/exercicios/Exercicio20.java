package exercicios;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println(' ');
			System.out.println("Escolha que tipo de operação deseja:");
			System.out.println(' ');
			System.out.println("[1] ADIÇÃO");
			System.out.println("[2] SUBTRAÇÃO");
			System.out.println("[3] MULTIPLICAÇÃO");
			System.out.println("[4] DIVISÃO");
			System.out.println(' ');
			System.out.println("[5] Sair da Calculadora");
			System.out.println(' ');
			System.out.print("Escolha sua opção: ");
			opcao = teclado.nextInt();
			System.out.println(' ');
			
			if (opcao == 1) {
				int numero1, numero2 = 0;
				System.out.print("Digite o 1º número: ");
				numero1 = teclado.nextInt();
				System.out.print("Digite o 2º número:");
				numero2 = teclado.nextInt();
				System.out.println(' ');
				System.out.println("Resultado: " + (numero1 + numero2));
			} else if (opcao == 2) {
				int numero1, numero2 = 0;
				System.out.print("Digite o 1º número: ");
				numero1 = teclado.nextInt();
				System.out.print("Digite o 2º número: ");
				numero2 = teclado.nextInt();
				System.out.println(' ');
				System.out.println("Resultado: " + (numero1 - numero2));
			} else if (opcao == 3) {
				int numero1, numero2 = 0;
				System.out.print("Digite o 1º número: ");
				numero1 = teclado.nextInt();
				System.out.print("Digite o 2º número: ");
				numero2 = teclado.nextInt();
				System.out.println(' ');
				System.out.println("Resultado: " + (numero1 * numero2));
			} else if (opcao == 4) {
				float numero1, numero2 = 0;
				System.out.print("Digite o 1º número: ");
				numero1 = teclado.nextInt();
				System.out.print("Digite o 2º número: ");
				numero2 = teclado.nextInt();
				System.out.println(' ');
				
				if (numero1 == 0 || numero2 == 0) {
					System.out.println("NÃO É POSSÍVEL FAZER DIVISÃO COM 0!");
				} else {
					System.out.println("Resultado: " + (numero1 / numero2));
				}
			} else if (opcao == 5) {
				System.out.println("Calculadora encerrada!");
			} else {
				System.out.println("Opcão inválida!");
			}
		} while (opcao != 5);
		teclado.close();
	}
}
