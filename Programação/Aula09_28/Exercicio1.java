
package Aula09_28;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int[][] navios = new int[6][6];
        String[][] jogadas ={{"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"}};
        int linha = 0;
        int coluna = 0;
        int cont = 0;
        boolean teste = true;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                navios[i][j] = (int)(Math.random() *2);
            }
        }
        for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(jogadas[i][j] + " ");
                }
                System.out.println("");
        }
        while(teste){
            System.out.print("Linha: ");
                linha = en.nextInt();
                System.out.print("Coluna: ");
                coluna = en.nextInt();
                
            if ((linha >=1 && linha <=6) && (coluna>=1 && coluna<=6)) {
                if (navios[linha-1][coluna-1] == 1) {
                System.out.println("Navio");
                jogadas[linha-1][coluna-1] = "[N]";
                }
                else{
                    jogadas[linha-1][coluna-1] = "[A]";
                }
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(jogadas[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("Digite um valor entre 1 e 6");
                System.out.println("Desejá continuar:");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                System.out.print("Resposta: ");
                cont = en.nextInt();
                if (cont == 1) 
                    teste = true;
                else
                teste = false; 
            }else
                System.out.println("Digite um valor correto");
        }
    }
}
