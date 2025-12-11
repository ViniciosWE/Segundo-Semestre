package Aula08_24;

import java.util.Scanner;

public class DecimalEmHexadecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor decimal: ");
        int decimal = entrada.nextInt();
        String hexadecimalInvertido = "";

        if (decimal <= 15) {
            hexadecimalInvertido += (char) ('A' + (decimal - 10));
        } else {
            while (decimal > 0) {
                int mod = decimal % 16;
                if (mod < 10) {
                    hexadecimalInvertido += mod;
                } else {
                    hexadecimalInvertido += (char) ('A' + (mod - 10));
                }
                decimal /= 16;
            }
        }

        String hexadecimal = "";
        System.out.print("O valor em Hexadecimal é: ");
        for (int i = hexadecimalInvertido.length() - 1; i >= 0; i--) {
            hexadecimal += hexadecimalInvertido.charAt(i);
        }
        System.out.println(hexadecimal);
    }
}
