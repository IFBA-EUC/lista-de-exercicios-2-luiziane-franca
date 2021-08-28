import java.util.Scanner;

public class questao16 {
    
    public static void main(String[] args) {
        // questão 16
        int tempo = ler();
        mostrar_tempo(tempo);
    }
    public static int ler(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        return teclado.nextInt();
    }
    public static void mostrar_tempo(int t){
        System.out.printf("%d segundos é igual à: %dh %dmin %ds", t, hora(t), minuto(t), segundo(t));
        
    }public static int hora(int s){
        return (int)s/3600;
    }
    public static int minuto(int s){
        return (int)(s%3600)/60;
    }
    public static int segundo(int s){
        return (int)((s%3600)%60);
    }
    
}

