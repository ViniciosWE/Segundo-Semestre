package Aula09_21;

public class Exercicio4 {
    public static void main(String[] args) {
        int m[][] = new int[4][7];
        int v[] = new int[7];
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                m[i][j] = (int) (Math.random() * 10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        for (int j = 0; j < 7; j++) {
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                soma += m[i][j];
            }
            v[j] = soma;
            System.out.println("");
        }
    }
}
