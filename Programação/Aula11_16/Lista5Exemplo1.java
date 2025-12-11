package Aula11_16;

import java.util.Scanner;

public class Lista5Exemplo1 {
    static String gabarito[];
    static String jogo[];    
    static int acertos = 0;
    static int erros = 0;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palavras = {"PARALELEPIPEDO", "SORVETE", "TOPETE", "BONE",
            "CACHACA", "CANETA", "CHAVE", "PNEU", "MELANCIA", "AGUA", "ABACAXI"};        
        String p = palavras[sorteiaPosicao()]; 
        gabarito = new String[p.length()];
        jogo = new String[p.length()]; 
        preencheVetor(p);
        while((acertos < p.length()) && (erros < 7)){
            imprimeJogo();
            System.out.print("Digite uma letra: ");
            String letra = entrada.next();
            if (verificarAcerto(letra)){                
                System.out.println("Letra encontrada na palavra!");
            }
            else{
                System.out.println("Esta letra não existe na palavra!");
            }
        }
        jogoEncerrado();
    }
    public static boolean verificarAcerto(String l){
        boolean achou = false;
        for (int i = 0; i < gabarito.length; i++) {
            if (gabarito[i].equals(l)){
                contAcertos();
                jogo[i] = gabarito[i];
                achou = true;
            }
        }
        if(!achou)
            contErros();
        return achou;
    }
    public static int sorteiaPosicao(){
        return (int) (Math.random() * 10);
    }
    public static void preencheVetor(String p){
        for (int i = 0; i < p.length(); i++) {
            gabarito[i] = String.valueOf(p.charAt(i));
            jogo[i] = "_";
        }
    }
    public static void imprimeJogo(){
        for (int i = 0; i < jogo.length; i++) {
            System.out.print(jogo[i] + " ");
        }
    }
    public static void contAcertos(){
        acertos++;
    }
    public static void contErros(){
        erros++;
    }
    public static void jogoEncerrado(){
        if (acertos == gabarito.length)
            System.out.println("Você venceu!");
        else
            System.out.println("Você perdeu!");
    }
}
