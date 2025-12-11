
package Aula08_03;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int valorB = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 10)+ 1;
            b[i] = a[i] * i;
        }
        System.out.println("i \ta[i] \tb[i]");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + a[i] + "\t" + b[i]);
        }
    }
}
