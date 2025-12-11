package Aula08_24;

import java.util.Scanner;

public class ConversaoDecimalBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        int div = num;
        int resto;
        String bin = "";
        while(div > 0){
            resto = div % 2;
            div = div / 2;
            bin = bin + resto;  
        }
        String binario[] = new String[bin.length()];
        int posBin = bin.length() - 1;
        System.out.println("Conversão de " + num + " para binário");
        for (int i = 0; i < binario.length; i++) {
            binario[i] = String.valueOf(bin.charAt(posBin));
            System.out.print(binario[i] + " ");
            posBin--;
        }
    }
}
