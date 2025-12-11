
package Aula09_28;

import java.util.Scanner;

public class Velha {

    public static void main(String[] args) {
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
         System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓ Jogo da velha ▓▓▓▓▓▓▓▓▓ ");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
         System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("");
        
        String velha[][] = new String[3][3];
        System.out.println("Jogo da velha [3X3]");
        System.out.println("   1  2  3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                velha[i][j] = " ";
                System.out.print("[" + velha[i][j] + "]");
            }
            System.out.println("");
        }

        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        String jogador = "X";

        while (continuar == false) {
            System.out.print(" Linha :");
            int lin = entrada.nextInt() - 1;
            System.out.print(" Coluna :");
            int col = entrada.nextInt() - 1;

            if (velha[lin][col].equals(" ")) {
                velha[lin][col] = jogador;
                System.out.println("Jogo da velha [3X3]");
                System.out.println("   1  2  3");
                for (int i = 0; i < 3; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print("[" + velha[i][j] + "]");
                    }
                    System.out.println("");
                }
                if (jogador.equals("X")) {
                    jogador = "0";
                } else {
                    jogador = "X";
                }
                System.out.println("Deseja continuar (S/N)?");
                String op = entrada.next().toUpperCase();
                if (op.equals("N")) {
                    continuar = true;
                }

            } else {
                System.out.println(" Faça outra jogada");
                System.out.println("Deseja continuar (S/N)?");
                String op = entrada.next().toUpperCase();
                if (op.equals("N")) {
                    continuar = true;
                }
            }
        }
                 System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓  Fim de Jogo  ▓▓▓▓▓▓▓▓▓ ");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }
}