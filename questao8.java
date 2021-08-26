import java.util.Scanner;
import java.util.ArrayList;

public class questao8 {
    public static void main(String[] args) {
        
        // Questão 8
        ArrayList<Integer> result = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Fibonacci! Digite um numero: ");
        int n = teclado.nextInt();
        int a = 0;
        int b = 1;
        while (n+1 > 0){
            result.add(a);
            int c = a;
            a = b;
            b = c+b;
            n--;
        }
        System.out.println(result);
        teclado.close();
    }
    }
