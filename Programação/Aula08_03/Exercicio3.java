
package Aula08_03;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int somaTotal = 0;
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
            somaTotal += numeros[i];
            System.out.println(numeros[i]);
        }
        System.out.println("A soma de todos os valores é: " + somaTotal);
    }
}
