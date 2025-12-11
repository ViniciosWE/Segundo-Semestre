
package Aula08_17;

import java.util.Scanner;

public class Exercicio2SegundaManeira {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Texto: ");
        String texto = entrada.nextLine().toUpperCase();
        texto = texto.replace(" ", "");
        String txt[] = new String[texto.length()];
        //Armazena cada caracter do texto em uma posição do vetor
        for (int i = 0; i < txt.length; i++) {
            txt[i]=String.valueOf(texto.charAt(i));
        }
        int fim = txt.length - 1; //lenght conta de 1 a 10 por isso diminui 1 e o vetor de 0 a 9 
        boolean palindromo = true;
        for (int inicio = 0; inicio < txt.length/2; inicio++) {
            if (!txt[inicio].equals(txt[fim])) {
                palindromo = false;
                break;
            }
            fim--;
        }
        if (palindromo == true) 
            System.out.println("A palavra é um PALÍNDROMO");
        else
            System.out.println("A palavra não é um PALÍNDROMO");
    }
}
