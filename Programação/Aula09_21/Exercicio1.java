package Aula09_21;

public class Exercicio1 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][5];
        int zeros = 0;
        int uns = 0;
        System.out.println("Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] == 0)
                    zeros++;
                else
                    uns++;
            }
            System.out.println("");
        }
        System.out.println("Quantidade 0: " + zeros);
        System.out.println("Quantidade 1: " + uns);
    }
}
