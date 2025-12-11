
package Aula08_31;

import java.util.Scanner;

public class Exercicio2_Versao3 {
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
        System.out.print("Frase: ");
        String frase = en.nextLine().toUpperCase().replace(" ", "")
                .replace(".", "").replace(",", "");
        System.out.println("frase com tudo em maiúsculo, sem espaço em branco,pontos e vírgulas: " + frase);
        String vetor[] = new String [frase.length()];
        for (int i = 0; i < vetor.length - 1; i++) {
            vetor[i] = String.valueOf(frase.charAt(i));
            System.out.println(i+1 + " = " + vetor[i]);
        }
        int a=0, e = 0, i = 0, o = 0,u=0;
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
