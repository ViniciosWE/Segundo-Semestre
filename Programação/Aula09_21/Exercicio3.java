package Aula09_21;

public class Exercicio3 {
    public static void main(String[] args) {
        int m[][] = new int[5][3];
        int v[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int) (Math.random() * 10);
                System.out.print(m[i][j] + " ");
                soma += m[i][j];
            }
            v[i] = soma;
            System.out.print(" - " + v[i]);
            System.out.println("");
        }
    }
}
