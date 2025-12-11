package Aula10_28;

public class CorridaTartarugaLebre {
    public static void main(String[] args) {
        String[][] pista = new String[2][49];
        boolean corrida = false;
        int auxTartaruga = 1; 
        int auxLebre = 1;     
        int contadorJogadas = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 49; j++) {
                pista[i][j] = "[   ]";
                pista[0][0] = "[ L ]";
                pista[1][0] = "[ T ]";
                System.out.print(pista[i][j] + "");
            }
            System.out.println("");
        }

        while (!corrida) {
            int sorteioLebre = (int) (Math.random() * 3 + 1);
            System.out.println(contadorJogadas + 1 + "º rodada");
            System.out.println("valor sorteado para lebre: " + sorteioLebre);
            int sorteioTartaruga = (int) (Math.random() * 3 + 1);
            System.out.println("valor sorteado para tartaruga: " + sorteioTartaruga);
            
            if ((auxLebre>= 47 && sorteioLebre == 1) && (auxTartaruga >= 47 && sorteioTartaruga == 2)) {
                auxLebre += 3;
                auxTartaruga += 2;
                
            }
             if ((auxLebre>= 47 && sorteioLebre == 1) && (auxTartaruga >= 48 && sorteioTartaruga == 1)) {
                auxLebre +=3;
                auxTartaruga +=1;
                
            }
            if (auxLebre > 46 && sorteioLebre == 1) {
                auxLebre +=3;
                
            }
            if (auxTartaruga >= 47 && sorteioTartaruga == 2) {
                auxTartaruga += 2;
                
            }
            if (auxTartaruga >= 48 && sorteioTartaruga == 1) {
                auxTartaruga +=1;
               
            }
            if (auxTartaruga >= 49) {
                System.out.println("TARTARUGA GANHOU!");
                corrida = true;
            }
            if (auxLebre >= 49) {
                System.out.println("LEBRE GANHOU!");
                corrida = true;
            }
            if (auxTartaruga >= 49 && auxLebre >= 49) {
                System.out.println("EMPATE");
                corrida = true;
            }

            if (auxLebre <= 48 && auxTartaruga <= 48) {
                if (sorteioLebre == 1) {
                    auxLebre += 3;
                } else if (sorteioLebre == 3) {
                    auxLebre = auxLebre;
                } else if (auxLebre > 1) {
                    auxLebre -= 1;
                }

                if (sorteioTartaruga == 1) {
                    auxTartaruga += 1;
                } else if (sorteioTartaruga == 2) {
                    auxTartaruga += 2;
                } else if (auxTartaruga > 1) {
                    auxTartaruga -= 1;
                }
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 49; l++) {
                        pista[k][l] = "[   ]";
                        pista[0][auxLebre - 1] = "[ L ]";
                        pista[1][auxTartaruga - 1] = "[ T ]";
                        System.out.print(pista[k][l] + " ");
                    }
                    System.out.println("");
                }

                contadorJogadas++;
            }
        }
    }
}
