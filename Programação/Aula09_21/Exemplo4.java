
package Aula09_21;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
        int [][] matriz = new int [2][3];
        
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.println("Valor antigo: " + matriz[i][j]);
                if (j % 2 != 0) {
                    matriz[i][j]+=2;
                }else{
                    matriz[i][j]+=3;
                }
                System.out.println("Valor novo: " + matriz[i][j]);
            }
        }    
    }
}