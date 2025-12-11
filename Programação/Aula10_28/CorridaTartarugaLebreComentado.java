package Aula10_28;

public class CorridaTartarugaLebreComentado {
    public static void main(String[] args) {
        // Declaração da matriz que representa a pista
        String[][] pista = new String[2][49];

        // Variável que controla se a corrida está acontecendo
        boolean corrida = false;

        // Posições iniciais da tartaruga e da lebre na pista
        int auxTartaruga = 1;
        int auxLebre = 1;

        // Variável para contar o número de jogadas
        int contadorJogadas = 0;

        // Inicializa a matriz da pista com espaços vazios e coloca a lebre e a tartaruga nas posições iniciais
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 49; j++) {
                pista[i][j] = "[   ]";
                pista[0][0] = "[ L ]"; // Coloca a lebre na primeira posição
                pista[1][0] = "[ T ]"; // Coloca a tartaruga na primeira posição
                System.out.print(pista[i][j] + ""); // Exibe o estado inicial da pista
            }
            System.out.println("");
        }

        // Loop principal que controla a corrida
        while (!corrida) {
            // Sorteia um valor para a lebre e mostra na tela
            int sorteioLebre = (int) (Math.random() * 3 + 1);
            System.out.println(contadorJogadas + 1 + "º rodada");
            System.out.println("valor sorteado para lebre: " + sorteioLebre);
            
            // Sorteia um valor para a tartaruga e mostra na tela
            int sorteioTartaruga = (int) (Math.random() * 3 + 1);
            System.out.println("valor sorteado para tartaruga: " + sorteioTartaruga);
            
            // Lógica para determinar as movimentações da lebre e tartaruga com base nos sorteios

            // As condições abaixo tratam situações onde a lebre e a tartaruga já estão próximas do final da pista

            if ((auxLebre >= 47 && sorteioLebre == 1) && (auxTartaruga >= 47 && sorteioTartaruga == 2)) {
                auxLebre += 3;
                auxTartaruga += 2;
            }

            if ((auxLebre >= 47 && sorteioLebre == 1) && (auxTartaruga >= 48 && sorteioTartaruga == 1)) {
                auxLebre += 3;
                auxTartaruga += 1;
            }

            if (auxLebre > 46 && sorteioLebre == 1) {
                auxLebre += 3;
            }

            if (auxTartaruga >= 47 && sorteioTartaruga == 2) {
                auxTartaruga += 2;
            }

            if (auxTartaruga >= 48 && sorteioTartaruga == 1) {
                auxTartaruga += 1;
            }

            // Verifica se a tartaruga ganhou a corrida
            if (auxTartaruga >= 49) {
                System.out.println("TARTARUGA GANHOU!");
                corrida = true;
            }

            // Verifica se a lebre ganhou a corrida
            if (auxLebre >= 49) {
                System.out.println("LEBRE GANHOU!");
                corrida = true;
            }

            // Verifica se houve empate
            if (auxTartaruga >= 49 && auxLebre >= 49) {
                System.out.println("EMPATE");
                corrida = true;
            }

            // Lógica para movimentação quando a lebre e a tartaruga não estão próximas do final da pista
            if (auxLebre <= 48 && auxTartaruga <= 48) {
                // Movimenta a lebre com base no sorteio
                if (sorteioLebre == 1) {
                    auxLebre += 3;
                } else if (sorteioLebre == 3) {
                    // A lebre não se move
                    auxLebre = auxLebre;
                } else if (auxLebre > 1) {
                    // Move a lebre para trás
                    auxLebre -= 1;
                }

                // Movimenta a tartaruga com base no sorteio
                if (sorteioTartaruga == 1) {
                    auxTartaruga += 1;
                } else if (sorteioTartaruga == 2) {
                    auxTartaruga += 2;
                } else if (auxTartaruga > 1) {
                    // Move a tartaruga para trás
                    auxTartaruga -= 1;
                }

                // Limpa a matriz da pista e atualiza as posições da lebre e da tartaruga
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
