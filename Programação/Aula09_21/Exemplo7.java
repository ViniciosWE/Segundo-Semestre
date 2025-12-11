
package Aula09_21;

public class Exemplo7 {
    public static void main(String[] args) {
        double  [][] notas = {{1,3,3},
                              {2,6,7},
                              {3,5,4}};
        
        double media = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==0)
                    System.out.println("Aluno: " +notas[i][j]);
                else
                    media+=notas[i][j];
            }
            System.out.println("Média: " +(media/2));
            System.out.println(" ");
            media = 0;
        }
    }
}
