package Aula10_30;

import java.util.Scanner;

public class LebreTartaruga {
    static String[][] corrida = new String[2][50];
    public static void main(String[] args) {    
        int lebre = 0;
        int tartaruga = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                corrida[i][j] = "";                
            }
        }
        corrida[0][0] = "L";
        corrida[1][0] = "T";     
        while(verificarVencedor(lebre) == false && 
                verificarVencedor(tartaruga) == false){
            exibirMatriz();
            int numSort = sortearNumero();
            System.out.println("Número sorteado para Lebre: " + numSort);
            if (numSort == 1)
                lebre += 3;
            else
                if (numSort == 2){
                    lebre--;
                    lebre = Math.max(0, lebre);
                }
            moverCompetidor(lebre, 0, "L");
            numSort = sortearNumero();
            System.out.println("Número sorteado para Tartaruga: " + numSort);
            if (numSort == 1)
                tartaruga++;
            else
                if (numSort == 2)
                    tartaruga +=2;
                else{
                    tartaruga--;
                    tartaruga = Math.max(0, tartaruga);
                }
            moverCompetidor(tartaruga, 1, "T");
        }
        if (verificarVencedor(lebre) && verificarVencedor(tartaruga)){
            System.out.println("EMPATE");
        }
        else{
            if (verificarVencedor(lebre)){
                System.out.println("A LEBRE VENCEU!");
            }
            else{
                System.out.println("A TARTARUGA VENCEU!");
            }
        }
    }
    public static void moverCompetidor(int posicao, int linha, String letra){
        limparLinha(linha);
        if (posicao >= 0 && posicao <= 49){            
            corrida[linha][posicao] = letra;
        }
        else{
            if (posicao < 0)
                corrida[linha][0] = letra;
            if (posicao > 49)
                corrida[linha][49] = letra;
        }
    }
    public static void limparLinha(int linha){
        for (int i = 0; i < 49; i++) {
            corrida[linha][i] = "";
        }
    }
    public static int sortearNumero(){
        return (int) (Math.random() * 3) + 1;        
    }
    public static void exibirMatriz(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                if (corrida[i][j].equals("")){
                    System.out.print(". ");
                }
                else{
                    System.out.print(corrida[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    public static boolean verificarVencedor(int posicao){
        if (posicao >= 49){
            return true;
        }
        else{
            return false;
        }
    }
}
