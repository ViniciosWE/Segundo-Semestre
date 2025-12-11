
package Aula09_14;

import java.util.Scanner;

public class ValidarCPF {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Digite seu CPF (com pontos e traço): ");
        String entradaCpf = en.nextLine();

        // Remove pontos e traços do CPF para obter apenas os dígitos
        String cpfDigitos = entradaCpf.replace(".", "").replace("-", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpfDigitos.length() != 11) {
            System.out.println("CPF inválido (deve conter 11 dígitos).");
            return;
        }

        // Converte o CPF em um array de inteiros
        int[] cpfVetor = new int[11];
        for (int i = 0; i < 11; i++) {
            cpfVetor[i] = Character.getNumericValue(cpfDigitos.charAt(i));
        }

        // Verifica se todos os dígitos são iguais
        boolean todosDigitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpfVetor[i] != cpfVetor[0]) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            System.out.println("CPF inválido (todos os dígitos são iguais).");
            return;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += cpfVetor[i] * (10 - i);
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) 
            primeiroDigitoVerificador = 0;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += cpfVetor[i] * (11 - i);
        }
        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador >= 10) 
            segundoDigitoVerificador = 0;

        // Verifica se os dígitos verificadores estão corretos
        if (cpfVetor[9] == primeiroDigitoVerificador && cpfVetor[10] == segundoDigitoVerificador) 
            System.out.println("CPF válido.");
        else 
            System.out.println("CPF inválido.");
        
    }
}
