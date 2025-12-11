
package Aula08_17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numRandom[] = new int[20];
        int numSemRep[] = new int[20];
        System.out.println("Valores gerados pelo Random(): ");
        for (int i = 0; i < 20; i++) {
            numRandom[i] = (int) (Math.random() * 10 + 1);
            System.out.print(numRandom[i] + " ");
        }
        int pos = 0;
        for (int i = 0; i < numRandom.length - 1; i++) {
            boolean numExiste = false;
            for (int j = 0; j < 10; j++) {
                if (numRandom[i] == numSemRep[j]) {
                    numExiste = true;
                    break;
                }
            }
            if(!numExiste){
                numSemRep[pos] = numRandom[i];
                pos++;
            }
        }
        System.out.println("");
        System.out.println("Vetor com os valores sem repetição: ");
        for (int i = 0; i < numSemRep.length; i++) {
            if(numSemRep[i] > 0)
            System.out.print(numSemRep[i] + " ");
        }
    } 
}
