
package Aula08_03;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        String[] vetorNome = new String[nome.length()];
        for (int i = 0; i < nome.length(); i++) {
            vetorNome[i] = String.valueOf(nome.charAt(i));
        }
        System.out.println("");
        for (int i = 0; i < vetorNome.length; i++) {
            System.out.println(i + ": " + nome.charAt(i) + " " + vetorNome[i]);
        }
    }
}
