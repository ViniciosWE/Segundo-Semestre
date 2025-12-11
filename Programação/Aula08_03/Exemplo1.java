
package Aula08_03;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomeEst = new String[5];
        int[] idadeEst = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Estudante" + (i+1));
            System.out.print("Nome: ");
            nomeEst[i]= entrada.next();
            System.out.print("Idade: ");
            idadeEst[i] = entrada.nextInt();
        }
        System.out.println("");
        System.out.println("Estudante com mais de 21 anos: ");
        for (int i = 0; i < 5; i++) {
            if (idadeEst[i] > 21) {
                System.out.println(nomeEst[i]);
            }
        }
    }
}

