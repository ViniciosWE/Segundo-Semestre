package Aula08_24;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua matrícula: ");
        String matricula = scanner.nextLine();

        // Verifica se a matrícula possui o comprimento esperado (10 caracteres)
        if (matricula.length() != 10) {
            System.out.println("Matrícula inválida. Deve conter 10 caracteres.");
            return;
        }

        // Divide a matrícula em partes e armazena cada dígito em arrays
        String[] anoIngresso = new String[4];
        String[] codigoCurso = new String[3];
        String[] codigoTurma = new String[3];

        for (int i = 0; i < 4; i++) {
            anoIngresso[i] = String.valueOf(matricula.charAt(i));
        }

        for (int i = 4; i < 7; i++) {
            codigoCurso[i - 4] = String.valueOf(matricula.charAt(i));
        }

        for (int i = 7; i < 10; i++) {
            codigoTurma[i - 7] = String.valueOf(matricula.charAt(i));
        }

        // Armazena as partes da matrícula no vetor informações
        String[] informacoes = {anoIngresso[0] + anoIngresso[1] + anoIngresso[2] + anoIngresso[3],
                                 codigoCurso[0] + codigoCurso[1] + codigoCurso[2],
                                 codigoTurma[0] + codigoTurma[1] + codigoTurma[2]};

        // Imprime as informações separadas com as posições
        System.out.println("Ano de ingresso: " + informacoes[0]);
        System.out.println("Curso: " + informacoes[1]);
        System.out.println("Turma: " + informacoes[2]);
    }
}