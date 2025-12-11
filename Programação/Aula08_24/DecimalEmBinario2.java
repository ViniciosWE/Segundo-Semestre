
package Aula08_24;

import java.util.Scanner;

public class DecimalEmBinario2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        
        String binarioInvertido = "";
        String[] vetor = new String[binarioInvertido.length()];
        
        if (numero == 0 || numero == 1) {
            System.out.println("número já é binário");
        }
        else{
            while(numero >= 2){
                if (numero % 2 == 0) {
                    binarioInvertido+= "0";
                    numero /= 2;
                }
                else{
                    binarioInvertido += "1";
                    numero /= 2;
                }
            }
            binarioInvertido += "1";
        }
        String binario = "";
        System.out.println("O valor em binário é: ");
        for (int i = binarioInvertido.length() - 1; i >= 0 ; i--) {
            binario = String.valueOf(binarioInvertido.charAt(i));
            System.out.print(binario);
        }
    }
}
