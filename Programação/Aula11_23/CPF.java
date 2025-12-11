
package Aula11_23;

import java.util.Scanner;

public class CPF {
    static int vetorCPF[];
    static boolean dig1;
    static boolean dig2;
    
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("DIGITE SEU CPF: ");
        String cpf = en.nextLine();
        
        if (verificarDigitos(cpf)) {
            colocarVetor(cpf);
            int resto = calcularDigitos(10,8);
            if (verificarCalculos(resto, 9)) {
                System.out.println("1º dígito válido");
                dig1 = true;
            }
            else
                System.out.println("1º dígito inválido");
            
            resto = calcularDigitos(11,9);
            if (verificarCalculos(resto, 10)) {
                System.out.println("2º dígito válido");
                dig2 = true;
            }
            else
                System.out.println("2º dígito inválido");
            
        }
        else{
            System.out.println("CPF não contém 11 dígitos!!!");
        }  
        imprimirResultado();
    }
    
    public  static boolean verificarDigitos(String cpf){
        if (cpf.length() == 11)
            return true;
        else
            return false;
    }
    
    public static void colocarVetor(String cpf){
        vetorCPF = new int [cpf.length()];
        for (int i = 0; i < cpf.length() ; i++) {
            vetorCPF[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
    }
    
    public static int calcularDigitos(int mult, int posFinal){
        int soma = 0;
        for (int i = 0; i <= posFinal; i++) {
            soma += (vetorCPF[i] * mult);
            mult--;
        }
        int resto = (soma * 10) % 11;   
        return resto;
    }
    
    public static boolean verificarCalculos(int resto, int pos){
        if (resto == vetorCPF[pos])
            return  true;
        else if(resto == 10 && vetorCPF[pos] == 0)
            return true;
        else
            return false;
    }
    public static void imprimirResultado(){
        if (dig1 && dig2) {
            System.out.println("CPF VÁLIDO");
        }else
            System.out.println("CPF INVÁLIDO");
    
    }
    
        
    
}
