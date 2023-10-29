import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) { 
        
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

       int valor_1 = gerador.nextInt(25);
       int valor_2 = gerador.nextInt(25);
       
       System.out.println("Calcule:");
       System.out.println(valor_1 + " + " + valor_2);
       
       int x = sc.nextInt();

       System.out.println("sua resposta é:" + x);
       
       if (x == valor_1 + valor_2) {
        
       }

        sc close;
        }
    }
