// Vinicios e Juliandro

package Aula09_14;

import java.util.Scanner;

public class trabalhoDupla {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        boolean[] guarulhos = new boolean[10];
        boolean[] santosDumond = new boolean[10];
        
        int contadorGuarulhos = 0;
        int contadorSantosDumond = 0;

        while (contadorGuarulhos < 10 || contadorSantosDumond < 10) {
            System.out.println("Digite 1 para o aeroporto de Guarulhos");
            System.out.println("Digite 2 para o aeroporto Santos Dumond");
            System.out.print("Escolha: ");
            int aeroportos = en.nextInt();

            if (aeroportos == 1) {
                System.out.println("Assentos do aeroporto Guarulhos");
                for (int i = 0; i < guarulhos.length; i++) {
                    System.out.print((i + 1) + "º assento ");
                    if (guarulhos[i]) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }

                if (contadorGuarulhos == 10) {
                    System.out.println("Todos os assentos em Guarulhos estão ocupados.");
                    if (contadorSantosDumond < 10) {
                        System.out.print("Deseja comprar um assento em Santos Dumond? (Digite 1 para sim, 0 para não): ");
                        int comprar = en.nextInt();
                        if (comprar == 1) {
                            aeroportos = 2;
                            System.out.println("Assentos disponíveis em Santos Dumond:");
                            for (int j = 0; j < santosDumond.length; j++) {
                                System.out.print((j + 1) + "º assento ");
                                if (santosDumond[j]) {
                                    System.out.println("true");
                                } else {
                                    System.out.println("false");
                                }
                            }
                        } else {
                            System.out.println("O programa será encerrado.");
                            return;
                        }
                    }
                } else {
                    System.out.print("Escolha um assento de 1 a 10: ");
                    int assento = en.nextInt();

                    if (assento >= 1 && assento <= 10) {
                        if (!guarulhos[assento - 1]) {
                            guarulhos[assento - 1] = true;
                            contadorGuarulhos++;
                            System.out.println("Assento comprado com sucesso!");
                        } else {
                            System.out.println("Esse assento já está ocupado, escolha outro.");
                        }
                    } else {
                        System.out.println("Digite um valor correto!");
                    }
                }
            } else if (aeroportos == 2) {
                System.out.println("Assentos do aeroporto Santos Dumond");
                for (int i = 0; i < santosDumond.length; i++) {
                    System.out.print((i + 1) + "º assento ");
                    if (santosDumond[i]) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }

                if (contadorSantosDumond == 10) {
                    System.out.println("Todos os assentos em Santos Dumond estão ocupados.");
                    if (contadorGuarulhos < 10) {
                        System.out.print("Deseja comprar um assento em Guarulhos? (Digite 1 para sim, 0 para não): ");
                        int comprar = en.nextInt();
                        if (comprar == 1) {
                            aeroportos = 1;
                            System.out.println("Assentos disponíveis em Guarulhos:");
                            for (int j = 0; j < guarulhos.length; j++) {
                                System.out.print((j + 1) + "º assento ");
                                if (guarulhos[j]) {
                                    System.out.println("true");
                                } else {
                                    System.out.println("false");
                                }
                            }
                        } else {
                            System.out.println("O programa será encerrado.");
                            return;
                        }
                    }
                } else {
                    System.out.print("Escolha um assento de 1 a 10: ");
                    int assento = en.nextInt();

                    if (assento >= 1 && assento <= 10) {
                        if (!santosDumond[assento - 1]) {
                            santosDumond[assento - 1] = true;
                            contadorSantosDumond++;
                            System.out.println("Assento comprado com sucesso!");
                        } else {
                            System.out.println("Esse assento já está ocupado, escolha outro.");
                        }
                    } else {
                        System.out.println("Digite um valor correto!");
                    }
                }
            } else {
                System.out.println("Digite 1 ou 2 para escolher o aeroporto.");
            }
        }
    }
}
