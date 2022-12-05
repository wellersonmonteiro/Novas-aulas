package beecrowd;
import java.util.Scanner;
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, y1, x2, y2, a, b, c;
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        a = (Math.pow((x2 -x1), 2));
        b = (Math.pow((y2 - y1), 2));
        c = Math.sqrt(a + b);
        System.out.printf("%.4f", c);


    }
}
