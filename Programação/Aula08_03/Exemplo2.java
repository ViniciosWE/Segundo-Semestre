
package Aula08_03;

public class Exemplo2 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 100);
            System.out.println(i + ": " + numeros[i]);
        }
    }
}
