
package Aula08_24;

import java.util.Scanner;

public class DecimalEmOctal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um valor decimal: ");
        int decimal = entrada.nextInt();
        String octalInvertido = "";
            while(decimal > 0){
                if (decimal % 8 == 0 ) {
                    octalInvertido += "0";
                    decimal /= 8;
                }
                else{
                    int mod = decimal % 8;
                    octalInvertido += mod;
                    decimal /=8;
                }
            }
        String[] vetor = new String[octalInvertido.length()];
        String octal = "";
        System.out.print("O valor em octal é: ");
        for (int i = octalInvertido.length() - 1 ; i >= 0; i--) {
            octal = String.valueOf(octalInvertido.charAt(i));
            System.out.print(octal);
        }
    }
}
