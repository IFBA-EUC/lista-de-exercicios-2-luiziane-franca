import java.util.Scanner;

public class questao1 {
    /*Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 (recordar que o
    discriminante Δ = b² – 4ac, e que a raiz x = (–b ± √Δ)/2a).
    */
    public static void main (String [] args) {
        //  5x² + 2x - 2 = 0
        /* a= 5 b= 2 c= -2 
        = 2² - 4.5.-2  
        = 4 + 40
        = 44 
        x = (-2 +- raiz44)/ 2.5
        x1 = -2 + raiz44/ 10
        x2 = -2 - raiz44/10
        */
    

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        float a = teclado.nextFloat();
        System.out.println("Digite o valor de b: ");
        float b = teclado.nextFloat();
        System.out.println("Digite o valor de c: ");
        float c = teclado.nextFloat();
        
        float D = (float)Math.pow(b, 2) - 4*a*c;
    
        float X1 = (-b + (float)Math.sqrt(D))/(2*a);
        float X2 = (-b - (float)Math.sqrt(D))/(2*a);

        System.out.println(X1);
        System.out.println(X2);
        
        
    }
}
