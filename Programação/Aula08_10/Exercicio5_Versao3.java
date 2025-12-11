package Aula08_10;

import java.util.Scanner;

public class Exercicio5_Versao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palavras = new String[5];
        int[] tamPalavras = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "ª palavra: ");
            palavras[i] = entrada.nextLine();            
        }      
        for (int i = 0; i < 5; i++) {
            String palavra = palavras[i].replace(" ", "");
            tamPalavras[i] = palavra.length();
        }
        System.out.println("String \tTamanho");
        for (int i = 0; i < 5; i++) {
            System.out.println(palavras[i] + "\t" + tamPalavras[i]);
        }
    }
}
