
package Aula09_28;

import java.util.Random;
import java.util.Scanner;

public class batalha {

    public static void main(String[] args) {
        String campomemoria[][] = new String[6][6];
        String camporesultado[][] = new String[6][6];
        Random gerador = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                campomemoria[i][j] = "" + gerador.nextInt(2);
                camporesultado[i][j] = " ";
            }
        }
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
         System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓ Batalha naval ▓▓▓▓▓▓▓▓▓ ");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
         System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("");
         Scanner entrada = new Scanner(System.in);
        
        boolean continuar = false;

        while (continuar == false) {
            System.out.print(" Linha :");
            int lin = entrada.nextInt() - 1;
            System.out.print(" Coluna :");
            int col = entrada.nextInt() - 1;
            if (campomemoria[lin][col].equals("0")) {
                System.out.println("Água!!!!");
                camporesultado[lin][col] = "A";
            } else {
                System.out.println("Navio");
                camporesultado[lin][col] = "N";
            }
            System.out.println("batalha naval [ 6X6 ]");
            System.out.println("   1  2  3  4  5  6");
            for (int i = 0; i < 6; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 6; j++) {
                    System.out.print("[" + camporesultado[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("Deseja continuar (S/N)?");
            String op = entrada.next().toUpperCase();
            if (op.equals("N")) {
                continuar = true;
            }
        }

         System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓  Fim de Jogo  ▓▓▓▓▓▓▓▓▓ ");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

    }
}
