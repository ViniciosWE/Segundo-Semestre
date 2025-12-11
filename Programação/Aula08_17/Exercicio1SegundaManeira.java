
package Aula08_17;

import java.util.Scanner;

public class Exercicio1SegundaManeira {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = entrada.nextLine().toUpperCase();
        String vogais[]= {"A", "E", "I", "O", "U"};
        int contVogais = 0;
        for (int i = 0; i < texto.length(); i++) {
            String letra = String.valueOf(texto.charAt(i));
            for (int j = 0; j < vogais.length; j++) {
                if (letra.equals(vogais[j])) {
                    contVogais++;
                    break;
                }
            }
        } 
        System.out.println("O tottal de vogais é: " + contVogais);
    }
}
