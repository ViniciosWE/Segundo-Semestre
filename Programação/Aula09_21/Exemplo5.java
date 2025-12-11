
package Aula09_21;

public class Exemplo5 {
    public static void main(String[] args) {
        double  [][] notas = {{1,3,3},
                              {2,6,7},
                              {3,5,4}};
        
       double media1 = (notas[0][1] + notas[0][2])/2;
       double media2 = (notas[1][1] + notas[1][2])/2;
       double media3 = (notas[2][1] + notas[2][2])/2;
       
        System.out.println("meida do aluno " + notas[0][0] + " = " + media1);
        System.out.println("meida do aluno " + notas[1][0] + " = " + media2);
        System.out.println("meida do aluno " + notas[2][0] + " = " + media3);
        
        if (media1 >=7 ) 
            System.out.println("aluno " + notas[0][0] +" APROVADO");
        else
            System.out.println("aluno " + notas[0][0] +" REPROVADO");
        if (media2 >=7 ) 
            System.out.println("aluno " + notas[1][0] +" APROVADO");
        else
           System.out.println("aluno " + notas[1][0] +" REPROVADO");
        if (media3 >=7 ) 
            System.out.println("aluno " + notas[2][0] +" APROVADO");
        else
           System.out.println("aluno " + notas[2][0] +" REPROVADO");
    }
}
