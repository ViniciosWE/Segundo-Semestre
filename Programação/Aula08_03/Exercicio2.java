
package Aula08_03;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 10);
            System.out.println((i+1) + ": " + numeros[i]);
        }
        System.out.println("");
        System.out.println("Valores em ordem inversa");
        for (int j = 9; j >= 0; j--) {
            System.out.println(j + ": " + numeros[j]);
        }
    }
}
