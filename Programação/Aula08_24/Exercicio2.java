package Aula08_24;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = en.nextLine().toLowerCase();
        int total = nomeCompleto.length();
        String[] login = new String[6]; 

        for (int i = 0; i < 3; i++) {
            String primeiras = String.valueOf(nomeCompleto.charAt(i));
            login[i] = primeiras;
        }

        int j = 0;
        for (int i = total - 3; i < total; i++) {
            login[3 + j] = String.valueOf(nomeCompleto.charAt(i));
            j++;
        }

        for (int i = 0; i < login.length; i++) {
            System.out.print(login[i]);
        }
    }
}



