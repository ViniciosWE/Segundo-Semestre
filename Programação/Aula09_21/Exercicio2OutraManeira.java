
package Aula09_21;

import java.util.Scanner;

public class Exercicio2OutraManeira {
    public static void main(String[] args) {
        int [][] matriz= new int[3][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
        System.out.println("Digite o primeiro valor :");
        matriz[i][0]=sc.nextInt();
        System.out.println("Digite o segundo valor :");
        matriz[i][1]=sc.nextInt();
       }
        System.out.println("");
        int soma=0;
        for (int i=0;i<matriz.length;i++){
        for (int j=0;j<matriz[i].length;j++){
            soma+=matriz[i][j];
            System.out.print(matriz[i][j]+" ");
        }
            System.out.println("");
        }
        System.out.println("Soma de todos os valores :"+soma);
    }
}
