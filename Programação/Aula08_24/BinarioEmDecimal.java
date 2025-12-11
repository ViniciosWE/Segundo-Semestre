
package Aula08_24;

import java.util.Scanner;

public class BinarioEmDecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor em binario: ");
        String binario = entrada.nextLine();
        int potencia = 0;
        int decimal = 0;
        
        String valorBinario[] = new String[binario.length()];
        for (int i = valorBinario.length -1; i >= 0; i--) {
            valorBinario[i] = String.valueOf(binario.charAt(i));
            if (valorBinario[i].equals("1")) {
                decimal +=  (int) Math.pow(2, potencia);
            }
            potencia++;
        }
        System.out.println("O valor em decimal é: " + decimal);
    }
}
