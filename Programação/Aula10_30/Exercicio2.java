
package Aula10_30;

import java.util.Scanner;

public class Exercicio2 {
    private static int numeroSorteado;
    private static int tentativas;

    public static void sorteiaNum() {
        numeroSorteado = (int) (Math.random() * 100) + 1;
    }

    public static void verificaAcerto(int chute) {
        if (chute == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + (tentativas + 1) + " tentativas.");
        } else {
            System.out.println("Você errou. Tente novamente.");
        }
    }

    public static void contaTentativas() {
        tentativas++;
        if (tentativas >= 7) {
            System.out.println("Suas tentativas acabaram. O número sorteado era " + numeroSorteado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sorteiaNum();
        tentativas = 0;

        while (tentativas < 7) {
            System.out.print("Tentativa #" + (tentativas + 1) + " - Digite seu chute (1 a 100): ");
            int chute = scanner.nextInt();
            verificaAcerto(chute);

            if (chute == numeroSorteado) {
                break;
            }

            contaTentativas();
        }
    }
}
