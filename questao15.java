import java.util.Scanner;


public class questao15 {

    
    public static void main(String[] args) {
        //Questão 15
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nota da Unidade 1: ");
        double n1 = teclado.nextDouble();
        System.out.println("Nota da Unidade 2: ");
        double n2 = teclado.nextDouble();
        System.out.println("Nota da Unidade 3: ");
        double n3 = teclado.nextDouble();
        
        double m = media(n1, n2, n3);
        System.out.printf("Com a media %.2f, o aluno está %s", m, status(m));
        teclado.close();
    }
    
    public static double media(double a, double b, double c){
        double re = (a+b+c)/3;
        return re;
    }
    public static String status(double n){
        if (n>=6){
            return "Aprovado";
        }else{
            if (n>=4){
                return "em Verificação Sublementar";
            }else{
                return "Reprovado";
            }
        }
    }
}


