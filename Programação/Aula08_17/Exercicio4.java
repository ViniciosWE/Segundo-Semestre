
package Aula08_17;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeira palavra: ");
        String texto1 = entrada.nextLine().toUpperCase();
        System.out.println("Segunda palavra: ");
        String texto2 = entrada.nextLine().toUpperCase();
        String alfabeto[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
            "V", "W", "X", "Y", "Z"};
        String t1 = "";
        String t2 = "";
        if (texto1.length() == texto2.length()) {
            for (int i = 0; i < alfabeto.length; i++) {
                for (int j = 0; j < texto1.length(); j++) {
                    if(alfabeto[i].equals(String.valueOf(texto1.charAt(j)))){
                        t1 += alfabeto[i];
                    }
                    if(alfabeto[i].equals(String.valueOf(texto2.charAt(j)))){
                        t2 += alfabeto[i];
                    }
                }     
            }
            if (t1.equals(t2)) {
                System.out.println("As palavras são anagramas");
            }
            else
                System.out.println("As palavras não são anagramas");
        }
        else{
            System.out.println("As palavras não são anagramas");
        }
    }
}
