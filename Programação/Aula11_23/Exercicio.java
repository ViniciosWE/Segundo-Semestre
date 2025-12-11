
package Aula11_23;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Base: ");
        int base = en.nextInt();
        System.out.print("Expoente: ");
        int expoente = en.nextInt();
        System.out.println("Resultado: " + calcularExpoente(base, expoente));
        calcularExpoente(base, expoente);
    }
    
    public static int calcularExpoente(int base, int expoente){
        if (expoente == 0) 
            return 1;
        else{
            return base * calcularExpoente(base, expoente -1);
        }
    }
}
