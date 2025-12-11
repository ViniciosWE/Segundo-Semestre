package Aula11_16;

public class Exercicio1 {
    String aux[] = new String[20];
    static String alfa[]= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "L", "M", "N", "O", "P", "Q", "R", "R", "S",
                            "T", "U", "V", "W", "X", "Y", "Z"};
    static String beta[] = new String[20];
    
    public static void main(String[] args) {
        sortearValor();
        
        System.out.println("");
        System.out.println("Novo valor: ");
        System.out.println("");
        
        retirarRepetidos();
    }
    
    public static void sortearValor(){
        for (int i = 0; i < beta.length; i++) {
            int valor = (int) (Math.random()* 26);
            beta[i] = alfa[valor];
            System.out.println(alfa[valor]);
        }
    }
    
    public static void retirarRepetidos(){
        for (int i = 0; i < beta.length; i++) {
            for (int j = i + 1; j < beta.length; j++) {
                if (beta[i].equals(beta[j])) {
                    beta[j] = "";
                }
            }
        }
        
        for (int i = 0; i < beta.length; i++) {
            if (!beta[i].equals("")) {
                System.out.println(beta[i]);
            }
        }
    }
}
