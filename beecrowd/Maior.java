package beecrowd;
import java.util.Scanner;


public class Maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   int x = entrada.nextInt();
   double y = entrada.nextDouble();
   double distancia = x / y;

   System.out.printf("%.3f km/l\n", distancia);



    }
}
