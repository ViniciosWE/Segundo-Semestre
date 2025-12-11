
package Aula10_30;

import java.util.Scanner;

public class Exercicio1 {
    private static int votosJose = 0;
    private static int votosMaria = 0;
    private static int votosBranco = 0;
    private static int votosNulo = 0;

    public static void somaVotos() {
        int totalVotos = votosJose + votosMaria + votosBranco + votosNulo;
        System.out.println("Total de votos: " + totalVotos);
    }

    public static void verificaVencedor() {
        if (votosJose > votosMaria) {
            System.out.println("José é o candidato vencedor com " + votosJose + " votos.");
        } else if (votosMaria > votosJose) {
            System.out.println("Maria é a candidata vencedora com " + votosMaria + " votos.");
        } else {
            System.out.println("Houve um empate entre José e Maria, ambos com " + votosJose + " votos.");
        }
    }

    public static void brancosNulos() {
        int totalVotos = votosJose + votosMaria + votosBranco + votosNulo;
        double percentualBranco = (double) votosBranco / totalVotos * 100;
        double percentualNulo = (double) votosNulo / totalVotos * 100;

        System.out.println("Percentual de votos em branco: " + percentualBranco + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulo + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String voto;

        while (true) {
            System.out.println("A – José");
            System.out.println("B – Maria ");
            System.out.println("C – Branco ");
            System.out.println("D – Nulo ");
            System.out.println("E – Encerrar votação ");
            System.out.print("Digite seu voto: ");
            voto = scanner.nextLine().toUpperCase();

            if (voto.equals("E")) {
                break; 
            } else if (voto.equals("A")) {
                votosJose++;
            } else if (voto.equals("B")) {
                votosMaria++;
            } else if (voto.equals("C")) {
                votosBranco++;
            } else if (voto.equals("D")) {
                votosNulo++;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida");
            }
        }
        
        somaVotos();
        verificaVencedor();
        brancosNulos();
    }
}
