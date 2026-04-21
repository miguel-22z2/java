package exercicios;

import java.util.Scanner;

public class Exercicio50 {
	static final String VERMELHO = "\u001B[31m";
    static final String AZUL    = "\u001B[34m";
    static final String RESET   = "\u001B[0m";
 
    static char[] tabuleiro = {'1','2','3','4','5','6','7','8','9'};
    static char jogadorAtual = 'X';
 
    static String colorir(char c) {
        if (c == 'X') {
            return VERMELHO + c + RESET;
        }
        if (c == 'O') {
            return AZUL + c + RESET;
        }
        return String.valueOf(c);
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jogadas = 0;
 
        while (true) {
            exibirTabuleiro();
            System.out.print("Jogador " + colorir(jogadorAtual) + ", escolha uma posição (1-9): ");
 
            int pos;
            try {
                pos = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número de 1 a 9.");
                continue;
            }
 
            if (pos < 0 || pos > 8) {
                System.out.println("Posição inválida! Escolha entre 1 e 9.");
                continue;
            }
 
            if (tabuleiro[pos] == 'X' || tabuleiro[pos] == 'O') {
                System.out.println("Posição já ocupada! Escolha outra.");
                continue;
            }
 
            tabuleiro[pos] = jogadorAtual;
            jogadas++;
 
            if (verificarVencedor()) {
                exibirTabuleiro();
                System.out.println("Parabéns! Jogador " + colorir(jogadorAtual) + " venceu!");
                break;
            }
 
            if (jogadas == 9) {
                exibirTabuleiro();
                System.out.println("Empate!");
                break;
            }
 
            if (jogadorAtual == 'X') {
                jogadorAtual = 'O';
            } else {
                jogadorAtual = 'X';
            }
        }
 
        scanner.close();
    }
 
    static void exibirTabuleiro() {
        System.out.println("\n " + colorir(tabuleiro[0]) + " | " + colorir(tabuleiro[1]) + " | " + colorir(tabuleiro[2]));
        System.out.println("---+---+---");
        System.out.println(" " + colorir(tabuleiro[3]) + " | " + colorir(tabuleiro[4]) + " | " + colorir(tabuleiro[5]));
        System.out.println("---+---+---");
        System.out.println(" " + colorir(tabuleiro[6]) + " | " + colorir(tabuleiro[7]) + " | " + colorir(tabuleiro[8]));
        System.out.println();
    }
 
    static boolean verificarVencedor() {
        int[][] combinacoes = {
            {0,1,2}, {3,4,5}, {6,7,8}, // linhas
            {0,3,6}, {1,4,7}, {2,5,8}, // colunas
            {0,4,8}, {2,4,6}            // diagonais
        };
 
        for (int i = 0; i < combinacoes.length; i++) {
            int[] c = combinacoes[i];
            if (tabuleiro[c[0]] == jogadorAtual &&
                tabuleiro[c[1]] == jogadorAtual &&
                tabuleiro[c[2]] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }
}
