package beecrowd;
import java.util.Scanner;
public class ConversaoDeTempo {
    public static void main(String[] args) {
        int a =0, min = 0, seg = 0, hor =0;
        Scanner entrada = new Scanner(System.in);
         a = entrada.nextInt();
         if(a < 60){
             seg = a;
         }
        if(a >= 60){
            min = Math.round(a / 60);
            seg = a % 60;       }
        if(min >= 60){
            hor = Math.round(min / 60);
            min = min % 60;
        }
        System.out.printf("%d:%d:%d\n", hor, min,seg);
    }
}
