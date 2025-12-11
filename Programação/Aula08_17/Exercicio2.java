
package Aula08_17;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        frase = frase.replace(" ", "").toLowerCase();
        int tamanho = frase.length();
        char[] vetor = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = frase.charAt(i);
        }
        boolean palindromo = true;
        for (int j = 0; j < tamanho; j++) {
            if (vetor[j] != vetor[tamanho - 1 - j]) {
                palindromo = false;
            }
        }
        
        if (palindromo) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
