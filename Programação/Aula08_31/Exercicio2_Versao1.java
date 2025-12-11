package Aula08_31;

import java.util.Scanner;

public class Exercicio2_Versao1 {
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
        int quantVogais[] = {a, e, i, o, u};
        int maior = 0;
        int pos = -1;
        for (int j = 0; j < quantVogais.length; j++) {
            if (quantVogais[j] > maior){
                maior = quantVogais[j];
                pos = j;
            }
        }
        switch(pos){
            case 0: System.out.println("A letra que aparece mais é A"); break;
            case 1: System.out.println("A letra que aparece mais é E"); break;
            case 2: System.out.println("A letra que aparece mais é I"); break;
            case 3: System.out.println("A letra que aparece mais é O"); break;
            case 4: System.out.println("A letra que aparece mais é U"); break;
        }
    }
}
