package Aula09_21;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("Soma: " + soma);
    }
}
