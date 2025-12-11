package Aula09_21;

public class Exemplo3 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,}, 
                          {4,5,6}};
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("linha: " + i + " coluna: " + j + " = " +matriz[i][j]);
            }
        }
    }
}