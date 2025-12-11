
package Aula09_21;

public class Exercicio5OutraManeira {
     public static void main(String[] args) {
        int[][] matriz = {
            {5, 7, 8, 2},
            {0, 15, 10, 9},
            {5, 3, 4, 4},
            {6, 12, 23, 55}
        };

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elementos da diagonal principal:");
        for (int i = 4; i > 0; i--) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
