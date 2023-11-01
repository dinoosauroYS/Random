import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) { 
        
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma dificuldade: " + "1, " + "2, " + "3");
        int dificuldade = sc.nextInt();

        if (dificuldade == 1) {
            System.out.println("dificuldade escolhida: easy");

            int valor_1 = gerador.nextInt(25);
            int valor_2 = gerador.nextInt(25);
             System.out.println("Calcule:");
       System.out.println(valor_1 + " + " + valor_2);
       
       int x = sc.nextInt();

       System.out.println("sua resposta é:" + x);
       sc.close();
       
       if (x == valor_1 + valor_2) {
        
        System.out.println("voce acertou!");
       }
       else
        System.out.println("voce errou:(");
        }
        
        if (dificuldade == 2) {
            System.out.println("dificuldade escolhida: medium");

            int valor_1 = gerador.nextInt(50);
            int valor_2 = gerador.nextInt(50);
             System.out.println("Calcule:");
       System.out.println(valor_1 + " + " + valor_2);
       
       int x = sc.nextInt();

       System.out.println("sua resposta é:" + x);
       sc.close();
       
       if (x == valor_1 + valor_2) {
        
        System.out.println("voce acertou!");
       }
       else
        System.out.println("voce errou:(");
        }
        if (dificuldade == 3) {
            System.out.println("dificuldade escolhida: hard");

            int valor_1 = gerador.nextInt(100);
            int valor_2 = gerador.nextInt(100);
             System.out.println("Calcule:");
       System.out.println(valor_1 + " + " + valor_2);
       
       int x = sc.nextInt();

       System.out.println("sua resposta é:" + x);
       sc.close();
       
       if (x == valor_1 + valor_2) {
        
        System.out.println("voce acertou!");
       }
       else
        System.out.println("voce errou:(");
        }
       
       
      
        
        }
        
    }
