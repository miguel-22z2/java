package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio24 {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
        int[] numeros = new int[10];
        int temporario; 
        
        for (int i = 0; i <= numeros.length - 1; i++) {
        	numeros[i] = numeroAleatorio.nextInt(100) + 1;
        }

        System.out.println("Lista original: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    temporario = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporario;
                }
            }
        }

        System.out.println("Lista ordenada: " + Arrays.toString(numeros));
    }
}
