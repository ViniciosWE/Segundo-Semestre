package Aula08_24;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = {8, 5, 13, 13, 1, 32, 21, 18, 33, 11};
        for (int j = 0; j < vetor.length - 1; j++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }
        System.out.println("");
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
