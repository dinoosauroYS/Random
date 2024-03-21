import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma dificuldade: " + "1, " + "2, " + "3");
        int dificuldade = sc.nextInt();
        int valor_1 = 0;
        int valor_2 = 0;
        int PontuaçãoPl = 0;
do{ 
           if (dificuldade == 1) {

            System.out.println("dificuldade escolhida: easy");

            valor_1 = gerador.nextInt(25);
            valor_2 = gerador.nextInt(25);

        }

        else if (dificuldade == 2) {

            System.out.println("dificuldade escolhida: medium");

            valor_1 = gerador.nextInt(50);
            valor_2 = gerador.nextInt(50);

        }
         else if (dificuldade == 3) {

            System.out.println("dificuldade escolhida: hard");

            valor_1 = gerador.nextInt(100);
            valor_2 = gerador.nextInt(100);

        }
        else  {
            System.out.println("utilize uma dificuldade elegivel");

        }

        System.out.println("Calcule:");
        System.out.println(valor_1 + " + " + valor_2);

        int x = sc.nextInt();

        System.out.println("sua resposta é:" + x);
        PontuaçãoPl += 1;
        if (x == valor_1 + valor_2) {

            System.out.println("voce acertou!");
            System.out.println(PontuaçãoPl);
        } else {
            System.out.println("voce errou:(");
            PontuaçãoPl -= 2;
            System.out.println(PontuaçãoPl);
        }
    }while (true);
    
    
    }
}
