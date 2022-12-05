package beecrowd;
import java.util.Scanner;
public class Distancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x ,y, a100 = 0, a50 = 0, a20 = 0, a10 = 0, a5 =0, a2 = 0, a1 = 0;
        x = entrada.nextInt();
        y= x ;
        while (x <= 0 || x >= 1000000 ){
            x = entrada.nextInt();

        }

        if(x >= 100){
          a100 = Math.round(x/100);

            x = x % 100;

        }
        if (x >= 50){
            a50 = Math.round(x/50);
            x = x % 50;
        }
        if( x >= 20){
            a20 = Math.round(x / 20);
            x = x % 20;

        }
        if(x >= 10){
            a10 = Math.round(x / 10);
            x = x % 10;
        }
        if( x >= 5){
            a5 = Math.round(x / 5);
            x = x % 5;
        }
        if( x >= 2) {
            a2 = Math.round(x /2);
            x = x % 2;

        }
        if( x >= 1){
            a1 = Math.round(x / 1);
            x = x % 1;
            
        }
        System.out.println(y);
        System.out.printf("%d nota(s) de R$ 100,00\n", a100);
        System.out.printf("%d nota(s) de R$ 50,00\n", a50);
        System.out.printf("%d nota(s) de R$ 20,00\n", a20);
        System.out.printf("%d nota(s) de R$ 10,00\n", a10);
        System.out.printf("%d nota(s) de R$ 5,00\n", a5);
        System.out.printf("%d nota(s) de R$ 2,00\n", a2);
        System.out.printf("%d nota(s) de R$ 1,00\n", a1);
    }
}
