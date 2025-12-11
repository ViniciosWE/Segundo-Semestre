
package Aula08_31;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random()*10+1);
            System.out.println(a[i]);
        }
        System.out.print("Digite um valor de 1 a 10: ");
        int numero = en.nextInt();
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == numero) {
                cont++;
            }
        }
        System.out.println("Quantidades de vezes que o número " + numero + " aparece no vetor " + cont);
        
    }
}
