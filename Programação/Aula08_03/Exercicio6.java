
package Aula08_03;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palavras = new String[5];
        int[] tamanhoPalavras = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("informe a " + (i+1) + "ª palavra: ");
            palavras[i] = entrada.next();
            tamanhoPalavras[i] = palavras[i].length();
        }
        System.out.println("\nString \tTamanho");
        for (int j = 0; j < 5; j++) {
            System.out.println(palavras[j] + "\t" + tamanhoPalavras[j]);
        }
    }
}
