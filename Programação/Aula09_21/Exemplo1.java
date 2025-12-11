
package Aula09_21;


public class Exemplo1 {
    public static void main(String[] args) {   
        int [][] matriz = new int[2][3];
        
        matriz[0][0] = 1;
        matriz[0][1] = 3;
        matriz[0][2] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 7;
        matriz[1][2] = 9;
        
        for (int i = 0; i <2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("linha: " + i + " coluna: " + j + " = " +matriz[i][j]);
            }
        }
    }
}
