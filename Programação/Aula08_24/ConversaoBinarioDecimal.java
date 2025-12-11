package Aula08_24;

import java.util.Scanner;

public class ConversaoBinarioDecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o binário: ");
        String num = entrada.nextLine();
        int binario[] = new int[num.length()];
        boolean bin = true;
        for (int i = 0; i < binario.length; i++) {
            int digito = Integer.parseInt(String.valueOf(num.charAt(i)));
            if ((digito == 1) || (digito == 0))
                binario[i] = digito;
            else{                
                System.out.println("O número informado não é binário");
                bin = false;
                System.exit(0);
            }
        }
        if (bin){
            int decimal = 0;
            int exp = 0;        
            for (int i = binario.length - 1; i >= 0; i--) {
                int calculo = (binario[i] * (int) Math.pow(2, exp));
                decimal = decimal + calculo;
                exp++;
            }
            System.out.println(num + " em decimal: " + decimal);
        }
    }
}
