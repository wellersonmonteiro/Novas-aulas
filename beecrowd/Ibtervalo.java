package beecrowd;
import java.util.Scanner;
public class Ibtervalo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double numero;
        numero = scn.nextDouble();
        if (numero < 0 || numero > 100){
            System.out.println("Fora de intervalo");
        }
        else if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else{
            System.out.println("Intervalo (75,100]");
        }

    }


}
