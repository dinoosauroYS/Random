import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) { 
        
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma dificuldade: " + "easy, " + "medium, " + "hard");
        String dificuldade = sc.next();

        if (dificuldade == "easy") {
            System.out.println("dificuldade escolhida: easy");
            int nivel = 25;
        }
        
        if (dificuldade == "medium") {
            int nivel = 50;
        }
        if (dificuldade == "hard") {
            int nivel = 100;
            
        }
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
        
    }
