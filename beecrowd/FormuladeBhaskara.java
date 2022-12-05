package beecrowd;
import java.util.Scanner;



public class FormuladeBhaskara {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        double a, b, c,bascara2, x1, x2;
        Double bascara1 = new Double(0.0);
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        bascara1 = Math.pow((Math.pow(b,2) - (4 * a * c)), (0.5));
        bascara2 = 2 * a;
        x1 = (- b + bascara1) / bascara2;
        x2 = (- b - bascara1) / bascara2;


        if ((bascara2 == 0) || bascara1.isNaN()){
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }





    }

}


