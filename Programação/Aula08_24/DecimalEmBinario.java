
package Aula08_24;

import java.util.Scanner;

public class DecimalEmBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();
        String binarioIvertido ="";
        while(numero > 0){
            if (numero % 2 == 0){
                binarioIvertido += "0";
                numero /= 2;
            }    
            else{
                binarioIvertido += "1";
                numero = (numero / 2) - 0.5;
            }
        }
        String vetor[] = new String [binarioIvertido.length()];
        String binario = "";
        System.out.println("O valor em binário é: ");
        for (int i = binarioIvertido.length() - 1; i >= 0 ; i--) {
            binario = String.valueOf(binarioIvertido.charAt(i));
            System.out.print(binario);
        }
    }
}
