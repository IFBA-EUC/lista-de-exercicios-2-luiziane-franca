import java.util.Scanner;

public class questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questão 2
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculando a distancia entre 2 pontos no espaço");
        System.out.print("Entre com a coodenada do Ponto A: \n X= ");
        int x1 = teclado.nextInt();
        System.out.print("Y= ");
        int y1 = teclado.nextInt();
        System.out.print("Z= ");
        int z1 = teclado.nextInt();
        
        System.out.print("Entre com a coodenada do Ponto B: \nX= ");
        int x2 = teclado.nextInt();
        System.out.print("Y= ");
        int y2 = teclado.nextInt();
        System.out.print("Z= ");
        int z2 = teclado.nextInt();
        
        double d= Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)
                + Math.pow(z2-z1, 2));
        
        System.out.printf("A distancia de A à B é: %.2f \n", d);
        teclado.close();
    }
    
}
