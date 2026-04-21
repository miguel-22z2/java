package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio26 {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio.nextInt(100) + 1;
        }
        System.out.println("Array original: " + Arrays.toString(array));
        
        Arrays.sort(array);
        
        int segundoMaior = array[array.length - 2];
        
        System.out.println("Segundo maior: " + segundoMaior);
    }
}