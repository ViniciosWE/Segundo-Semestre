
package Aula08_24;

public class Exercicio1 {
    public static void main(String[] args) {
        int num[] = new int[10];
        int cont = 0;
        int pos = 0;

        for (int n = 2; cont < 10; n++) {
            int div = 0; 

            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    div++;
                }
            }

            if (div == 2) {
                cont++;
                num[pos] = n;
                pos++;
            }
        }

        System.out.print("Números primos: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
