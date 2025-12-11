package Aula10_05;

import java.util.Scanner;

public class PiramideLetras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Palavra: ");
        String palavra = entrada.next();
        palavra = palavra.toUpperCase();
        int linhas = palavra.length();
        int colunas = (palavra.length() * 2) - 1;
        String piramide[][] = new String[linhas][colunas];
        int centro = palavra.length() - 1;
        for (int i = 0; i < piramide.length; i++) {  
            String letra = String.valueOf(palavra.charAt(i));
            for (int j = 0; j < piramide[0].length; j++) {
                if ((j <= (centro + i)) && (j >= (centro - i))){                    
                    piramide[i][j] = letra;
                }
                else
                    piramide[i][j] = " ";
            }
        }
        System.out.println("Piramide:");
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide[0].length; j++) {
                System.out.print(piramide[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
