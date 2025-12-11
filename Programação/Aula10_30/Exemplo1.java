package Aula10_30;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Estudante " + i);
            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            calcularMedia(nota1, nota2);
            System.out.println("");
        }
    }
    public static void calcularMedia(double n1, double n2){
        double media = (n1 + n2)/2;
        System.out.println("Média: " + media);
        verifAprov(media);
    }
    public static void verifAprov(double media){
        if (media >= 7)
            System.out.println("APROVADO!");
        else
            System.out.println("REPROVADO!");    
    }
}
