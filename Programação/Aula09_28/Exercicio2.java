
package Aula09_28;

import static java.time.Clock.system;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String[][] jogoVelha ={{"[ ]","[ ]","[ ]"},
                               {"[ ]","[ ]","[ ]"},
                               {"[ ]","[ ]","[ ]"}};
        int linha = 0;
        int coluna = 0;
        boolean x = true;
        boolean teste = true;
        int cont = 0;
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogoVelha[i][j] + " ");
                }
                System.out.println("");
        }
        while(teste){
            System.out.print("Linha: ");
            linha = en.nextInt();
            System.out.print("Coluna: ");
            coluna = en.nextInt();
            
            if ((linha >=1 && linha <=3) && (coluna>=1 && coluna<=3)) {
                if (jogoVelha[linha-1][coluna-1].equals("[X]") ||jogoVelha[linha-1][coluna-1].equals("[O]")) {
                    System.out.println("faça outra jogada");
                }else if (x) {
                    jogoVelha[linha-1][coluna-1] = "[X]" ;
                    x = false;
                }else{
                    jogoVelha[linha-1][coluna-1] = "[O]" ;
                    x = true;
                }
            }
             for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogoVelha[i][j] + " ");
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
        }
    }
}
