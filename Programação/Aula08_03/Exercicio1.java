
package Aula08_03;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] idade = new int[10];
        int maiorIdade = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade do " + (i+1) + " aluno: ");
            idade[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            maiorIdade = Math.max(idade[i], maiorIdade);
        }
        System.out.println("A maior idade é: " + maiorIdade);
    }
}
