
package Aula09_21;

public class Exemplo2 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,}, 
                          {4,5,6}};
        
        for (int i = 0; i <2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("linha: " + i + " coluna: " + j + " = " +matriz[i][j]);
            }
        }
    }
}
