package beecrowd;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, mes =0, ano =0, dia =0;
        a = entrada.nextInt();
        if(a >= 365){
            ano = Math.round(a / 365);
            a = a  % 365;
        }
        if( a >= 30){
            mes = Math.round(a / 30);
            a = a % 30;
        }
        if(a >= 1) {
            dia = a;
        }
        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

    }
}
