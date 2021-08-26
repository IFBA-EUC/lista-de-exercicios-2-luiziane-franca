import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        // Questão 6
        System.out.println("Digite um numero: ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
        String str_n = String.valueOf(n);
        System.out.println(str_n.length()); 
        teclado.close();
    }}
