package Aula09_14;

import java.util.Scanner;

public class PassagensAereas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean guarulhos[] = new boolean[10];
        boolean santosDumond[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            guarulhos[i] = false;
            santosDumond[i] = false;
        }
        int gua = 0;
        int san = 0;
        int aero = 0;
        int poltrona;
        int resposta;
        while((gua < 10) || (san < 10)){
            System.out.println("1 - Guarulhos");
            System.out.println("2 - Santos Dumond");
            System.out.print("Escolha: ");
            aero = entrada.nextInt();
            if (aero == 1){
                if (gua < 10){
                    System.out.println("Poltronas - Guarulhos ");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Polt. " + i + ": " + guarulhos[i]);
                    }
                    System.out.print("Escolha uma poltrona: ");
                    poltrona = entrada.nextInt();
                    if (!guarulhos[poltrona]){
                        guarulhos[poltrona] = true;
                        System.out.println("Poltrona reservada com sucesso!");
                        gua++;
                    }
                    else
                        System.out.println("Esta poltrona não está disponível!");
                }
                else{
                    System.out.println("Vôo GUARULHOS lotado!");
                    System.out.println("Deseja comprar passagem do Santos Dumond?");
                    System.out.println("Digite 1 para Sim ou 2 para Não: ");
                    resposta = entrada.nextInt();
                    if (resposta == 1){
                        if (san < 10){
                            System.out.println("Poltronas - Santos Dumond ");
                            for (int i = 0; i < 10; i++) {
                                System.out.println("Polt. " + i + ": " + santosDumond[i]);
                            }
                            System.out.print("Escolha uma poltrona: ");
                            poltrona = entrada.nextInt();
                            if (!santosDumond[poltrona]){
                                santosDumond[poltrona] = true;
                                System.out.println("Poltrona reservada com sucesso!");
                                san++;
                            }
                            else
                                System.out.println("Esta poltrona não está disponível!");
                        }
                        else{
                            System.out.println("Vôo SANTOS DUMOND lotado!");
                            System.out.println("Tente outro vôo!");
                        }
                    }
                }
            }
            else{
                if (san < 10){
                    System.out.println("Poltronas - Santos Dumond ");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Polt. " + i + ": " + santosDumond[i]);
                    }
                    System.out.print("Escolha uma poltrona: ");
                    poltrona = entrada.nextInt();
                    if (!santosDumond[poltrona]){
                        santosDumond[poltrona] = true;
                        System.out.println("Poltrona reservada com sucesso!");
                        san++;
                    }
                    else
                        System.out.println("Esta poltrona não está disponível!");
                }
                else{
                    System.out.println("Vôo SANTOS DUMOND lotado!");
                    System.out.println("Vôo GUARULHOS lotado!");
                    System.out.println("Deseja comprar passagem de GUARULHOS?");
                    System.out.println("Digite 1 para Sim ou 2 para Não: ");
                    resposta = entrada.nextInt();
                    if (resposta == 1){
                        if (gua < 10){
                            System.out.println("Poltronas - Guarulhos ");
                            for (int i = 0; i < 10; i++) {
                                System.out.println("Polt. " + i + ": " + guarulhos[i]);
                            }
                            System.out.print("Escolha uma poltrona: ");
                            poltrona = entrada.nextInt();
                            if (!guarulhos[poltrona]){
                                guarulhos[poltrona] = true;
                                System.out.println("Poltrona reservada com sucesso!");
                                gua++;
                            }
                            else
                                System.out.println("Esta poltrona não está disponível!");
                        }
                    }
                }
            }
        }
        System.out.println("Vôos lotados!!!");
    }
}
