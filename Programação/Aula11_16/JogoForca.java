
package Aula11_16;

import java.util.Scanner;

public class JogoForca {
    static int totalVotos = 0;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0;  int b = 0;  int c = 0;   int d = 0;
        String voto = "";
        while (!voto.equals("E")){
            System.out.println("A - Maria");
            System.out.println("B - José");
            System.out.println("C - Branco");
            System.out.println("D - Nulo");
            System.out.println("E - Encerrar votação");
            System.out.print("Vote: ");
            voto = entrada.next();
            switch(voto){
                case "A":   a++; break;
                case "B":   b++; break;
                case "C":   c++; break;
                case "D":   d++; break;
                case "E":   
                    System.out.println("Votação encerrada!");
                    System.out.println("Total de Votos: " + totalVotos);
                    System.out.println("Votos - Maria: " + a);
                    System.out.println("Votos - José: " + b);
                    System.out.println("Votos - Brancos: " + c);
                    System.out.println("Votos - Nulos: " + d);
                    verificaVencedor(a, b);
                    brancosNulos(c, d);
            }
            somaVotos();
        }
    }
    public static void somaVotos(){
        totalVotos++;
    }
    public static void verificaVencedor(int a, int b){
        if (a == b)
            System.out.println("EMPATE!");
        else
            if (a > b)
                System.out.println("Maria venceu!");
            else
                System.out.println("José venceu!");
            
    }
    public static void brancosNulos(int c, int d){
        int percBrancos = (c * 100)/totalVotos;
        int percNulos = (d * 100)/totalVotos;
        System.out.println("Percentual de votos brancos: " + percBrancos);
        System.out.println("Percentual de votos nulos: " + percNulos);
    }
}
