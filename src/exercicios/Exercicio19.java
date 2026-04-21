package exercicios;

public class Exercicio19 {
	public static void main(String[] args) {
		int valorProximo = 0;
		int valorAtual = 1;
		int valorAnterior = 0;
		
		System.out.println("Sequência Fibonacci até 10:");
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(valorAnterior + ", ");
			valorProximo = valorAtual + valorAnterior;
			valorAnterior = valorAtual;
			valorAtual = valorProximo;
			
		}
		
	}
}
