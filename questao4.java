/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author luiza
 */
public class questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double preco;
        int quant;
        int continuar = 1;

        while (true){
            System.out.println("Digite o nome do produto: ");
            nome = teclado.nextLine();
            System.out.println("Digite o preço: ");
            preco = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Qual a quantidade: ");
            quant = teclado.nextInt();
            
            // Mostrar o nome e o preço total
            System.out.println("Produto: "+nome);
            
            if (quant <= 10){
                System.out.println("O preço total é: R$ "+ preco* quant);
            }else{
                if (quant<= 20){
                    preco = (preco * 0.9)*quant;
                    System.out.println("O preço total é: R$ "+ preco);
                }else{
                    if (quant <= 50){
                        preco = preco * 0.8 * quant;
                        System.out.println("O preço total é: R$ "+ preco);
                    }else{
                        preco = preco * 0.75* quant;
                        System.out.println("O preço total é: R$ "+ preco);
                    }
                }
            }
            
            System.out.println("Se quiser continuar digite 1");
            continuar = teclado.nextInt();
            teclado.nextLine();
            if (continuar != 1){
                break;
            }       
        }
        teclado.close();
    }
}
