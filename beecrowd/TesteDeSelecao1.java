package beecrowd;
import java.util.Scanner;
public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A , B, C, D, E;
        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextInt();
        D = scn.nextInt();
        E = A % 2;

        if(B > C && D > A && (C +D) > (A + B) && A > 0 && B > 0 && C > 0 && D > 0 && E == 0 ){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println(" Valores nao aceitos");
        }
        scn.close();

    }
}
