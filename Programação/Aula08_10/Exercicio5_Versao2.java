package Aula08_10;

import java.util.Scanner;

public class Exercicio5_Versao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palavras = new String[5];
        int[] tamPalavras = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "ª palavra: ");
            palavras[i] = entrada.nextLine();
            int cont = 0;
            for (int j = 0; j < palavras[i].length(); j++) {
                if (!String.valueOf(palavras[i].charAt(j)).equals(" "))
                    cont++;
            }
            tamPalavras[i] = cont;
        }        
        System.out.println("String \tTamanho");
        for (int i = 0; i < 5; i++) {
            System.out.println(palavras[i] + "\t" + tamPalavras[i]);
        }
    }
}
