
package Aula11_23;

import java.util.Scanner;

public class GrelhaCardano {

    static String vetor[];
    static String gabarito[][] = new String[10][10];
    static String criptografia[][] = new String[10][10];

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Digite uma frase com no máximo 50 caracteres: ");
        String frase = en.nextLine();

        if (verificarTamanho(frase)) {
            frase = processarFrase(frase);
            preencheVetor(frase);
            colocarMatriz();
            imprimeMatriz("Matriz Gabarito:", gabarito);

            copiaGabarito();
            preencheCriptografia();
            imprimeMatriz("Matriz Criptografia:", criptografia);
        } else {
            System.out.println("A frase deve ter no máximo 50 caracteres.");
        }
    }

    public static boolean verificarTamanho(String frase) {
        return frase.length() <= 50;
    }

    public static String processarFrase(String frase) {
        return frase.replace(" ", "").toUpperCase();
    }

    public static void preencheVetor(String frase) {
        vetor = new String[frase.length()];

        for (int i = 0; i < frase.length(); i++) {
            vetor[i] = String.valueOf(frase.charAt(i));
        }
    }

    public static void colocarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gabarito[i][j] = "#";
            }
        }

        // Colocar a frase na matriz com espaçamento de no máximo 2 casas
        int colunaAtual = 0;
        int linhaAtual = 0;
        for (int i = 0; i < vetor.length; i++) {
            // Verificar se há espaço suficiente na linha atual
            if (colunaAtual + 2 < 10) {
                colunaAtual += (int) (Math.random() * 3); // Intervalo de até duas casas
                colunaAtual = Math.min(colunaAtual, 9); // Garante que a coluna não ultrapasse 9
            } else {
                // Se não houver espaço suficiente avança para a próxima linha
                colunaAtual = 0;
                linhaAtual++;
            }
            gabarito[linhaAtual][colunaAtual] = vetor[i];
            colunaAtual++; // Avançar para a próxima coluna
        }
    }

    public static void imprimeMatriz(String mensagem, String matriz[][]) {
        System.out.println(mensagem);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void copiaGabarito() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                criptografia[i][j] = gabarito[i][j];
            }
        }
    }

    public static void preencheCriptografia() {
        // Criar vetor com letras de A a Z
        char[] letras = new char[26];
        for (int i = 0; i < 26; i++) {
            letras[i] = (char) ('A' + i);
        }

        // Preencher criptografia onde há '#'
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (criptografia[i][j].equals("#")) {
                    // Escolher aleatoriamente uma letra do vetor
                    int indiceAleatorio = (int) (Math.random() * 26);
                    criptografia[i][j] = String.valueOf(letras[indiceAleatorio]);
                }
            }
        }
    }
}
