package Aula09_21;

public class Exercicio5 {
    public static void main(String[] args) {
        int m[][] = new int[4][4];
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = (int) (Math.random() * 10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    System.out.print(m[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
