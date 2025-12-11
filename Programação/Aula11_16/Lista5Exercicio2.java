package Aula11_16;

import java.util.Scanner;

public class Lista5Exercicio2 {
    static int tentativas = 0;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int chute;
        int num = sorteiaNumero();
        do{
            System.out.print("Digite um valor: ");
            chute = entrada.nextInt();
            if (chute > num)
                System.out.println("Chute muito alto!");
            if (chute < num)
                System.out.println("Chute muito baixo!");
        }while(!(verificaAcerto(num, chute)) && (contaTentativas()));
    }   
    public static int sorteiaNumero(){
        return (int) (Math.random() * 100) + 1;
    }
    public static boolean verificaAcerto(int num, int chute){
        if (chute == num){
            System.out.println("Você acertou! Parabéns!");
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean contaTentativas(){
        tentativas++;
        if (tentativas < 7)
            return true;
        else{
            System.out.println("Você perdeu!");
            return false;
        }
    }
}
