
package Aula09_21;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
        int qtAlunos = en.nextInt();
        double  [][] notas = new double[qtAlunos][3];
        
        for (int i = 0; i < qtAlunos; i++) {
            System.out.print("Digite o código do aluno: ");
            notas[i][0]=en.nextDouble();
            System.out.print("Digite a primeira nota: ");
            notas[i][1]=en.nextDouble();
            System.out.print("Digite a segunda nota:");
            notas[i][2]=en.nextDouble();
        }
        System.out.println("Notas calculadas");
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==0)
                    System.out.println("Aluno: " +notas[i][j]);
                else
                    media+=notas[i][j];
            }
            System.out.println("Média: " +(media/2));
            System.out.println(" ");
            media = 0;
        }
    }
}
