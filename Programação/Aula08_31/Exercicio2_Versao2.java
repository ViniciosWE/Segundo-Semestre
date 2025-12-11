package Aula08_31;

import java.util.Scanner;

public class Exercicio2_Versao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = entrada.nextLine().toUpperCase().replace(" ", "")
                .replace(".", "").replace(",", "");
        System.out.println("frase com tudo em maiúsculo, sem espaço em branco,pontos e vírgulas: " + frase);
        String vetor[] = new String [frase.length()];
        for (int k = 0; k < vetor.length - 1; k++) {
            vetor[k] = String.valueOf(frase.charAt(k));
            System.out.println(k+1 + " = " + vetor[k]);
        }
        int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;
        for (int j = 0; j < frase.length(); j++) {
            switch(String.valueOf(frase.charAt(j))){
                case "A": a++; break;
                case "E": e++; break;
                case "I": i++; break;
                case "O": o++; break;
                case "U": u++; break;
            }
        }
        if ((a > e) && (a > i) && (a > o) && (a > u))
            System.out.println("A vogal que mais aparece é A");
        if ((e > a) && (e > i) && (e > o) && (e > u))
            System.out.println("A vogal que mais aparece é E");
        if ((i > a) && (i > e) && (i > o) && (i > u))
            System.out.println("A vogal que mais aparece é I");
        if ((o > a) && (o > e) && (o > i) && (o > u))
            System.out.println("A vogal que mais aparece é O");
        if ((u > a) && (u > e) && (u > i) && (u > o))
            System.out.println("A vogal que mais aparece é U");
    }
}
