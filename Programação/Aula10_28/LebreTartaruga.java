// Murilo Ziani
// João Vitor San Martin
// Vinicios Weide Ebling
package Aula10_28;


public class LebreTartaruga {
    public static void main(String[] args) {
        int auxLeb = 0;
        int apaLeb = 0;
        int auxTar = 0;
        int apaTar = 0;
        boolean enc = false;
        String corrida[][] = new String[2][50];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                corrida[i][j] = "[ ]";
                corrida[0][0] = "[L]";
                corrida[1][0] = "[T]";
                System.out.print(corrida[i][j] + "");
            }
            System.out.println(" ");
        }

        while (!enc) {
            int ranLeb = (int) (Math.random() * 3 + 1);
            System.out.println("O número sorteado para a lebre foi: " + ranLeb);
            switch (ranLeb) {
                case 1:
                    if (auxLeb >= 47) {
                        System.out.println("A lebre ganhou a corrida!!");
                        corrida[0][49] = "[L]";
                        corrida[0][apaLeb] = "[ ]";
                        enc = true;
                        break;
                    } else {
                    auxLeb += 3;
                    if (auxLeb >= 49) {
                        System.out.println("A lebre ganhou a corrida!!");
                        enc = true;
                        break;
                    }
                    apaLeb = auxLeb - 3;
                    corrida[0][auxLeb] = "[L]";
                    corrida[0][apaLeb] = "[ ]";
                    break;
                    }
                case 2:
                    if (auxLeb == 0) {
                    } else {
                        auxLeb -= 1;
                        apaLeb = auxLeb + 1;
                        corrida[0][auxLeb] = "[L]";
                        corrida[0][apaLeb] = "[ ]";
                        break;
                    }
                case 3:
                    break;
            }
            int ranTar = (int) (Math.random() * 3 + 1);
            if (enc) {
            } else {
                System.out.println("O número sorteado para a Tartaruga foi: " + ranTar);
            }
            switch (ranTar) {
                case 1:
                    auxTar += 1;
                    if (auxTar >= 49) {
                        System.out.println("A tartaruga ganhou a corrida!!");
                        enc = true;
                        break;
                    }
                    apaLeb = auxTar - 1;
                    corrida[1][auxTar] = "[T]";
                    corrida[1][apaLeb] = "[ ]";
                    break;
                case 2:
                    auxTar += 2;
                    if (auxTar >= 49) {
                        System.out.println("A tartaruga ganhou a corrida!!");
                        corrida[1][49] = "[T]";
                        corrida[1][apaTar] = "[ ]";
                        enc = true;
                        break;
                    } else {
                    if (auxTar >= 49) {
                        System.out.println("A tartaruga ganhou a corrida!!");
                        enc = true;
                        break;
                    }
                    apaLeb = auxTar - 2;
                    corrida[1][auxTar] = "[T]";
                    corrida[1][apaLeb] = "[ ]";
                    break;
                    }
                case 3:
                    if (auxTar == 0) {
                    } else {
                        auxTar -= 1;
                        apaLeb = auxTar + 1;
                        corrida[1][auxTar] = "[T]";
                        corrida[1][apaLeb] = "[ ]";
                        break;
                    }
            }
            if (enc) {
            } else {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 50; j++) {
                        System.out.print(corrida[i][j] + "");
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}
