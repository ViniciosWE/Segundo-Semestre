
package Aula08_10;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] bancoDados = {"Mesa", "Livro", "Cadeira", "Flor", "Carro", "Computador", 
            "Cachorro", "Gato", "Sol", "Lua", "Avenida", "janela", "Casa", "Rio", "Mochila", 
            "Montanha", "Praia", "Bola", "Oceano", "Navio", "Lixeira", "Chave"};
        int acertos = 0;
        int erros = 0;
        int tamVetor = bancoDados.length;
        int posSorteada = (int) (Math.random() * tamVetor);
        String palavra = bancoDados[posSorteada];
        palavra = palavra.toUpperCase();
        String[] jogo = new String[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            jogo[i] = String.valueOf(palavra.charAt(i));
        }
        String[] espelho = new String[jogo.length];
        for (int i = 0; i < espelho.length; i++) {
            espelho[i] = "_";
        }
        while((erros < 7) && (acertos < jogo.length)){
            for (int i = 0; i < espelho.length; i++) {
            System.out.print(espelho[i] + " ");
            }
            System.out.println("");
            System.out.print("Digte uma letra: ");
            String letra = entrada.next();
            boolean achou = false;
            for (int i = 0; i < jogo.length; i++) {
                if (jogo[i].equals(letra)) {
                    espelho[i] = letra;
                    achou = true;
                    acertos++;
                }
            }
            if (achou == false) {
                erros++;
                System.out.println("Erros: " + erros);
            }
        } 
        if(acertos == jogo.length)
            System.out.println("Parabéns! Você acertou!");
        if(erros == 7)
            System.out.println("Você perdeu! Tente novamente!");
    }
}
