
package Aula08_03;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
            System.out.println((i+1) + ": " + numeros[i]);
            if (numeros[i] % 2 == 0) {
                cont++;
            }
        } 
        System.out.println("");
        System.out.println("Valores pares: " + cont);
    }
}
