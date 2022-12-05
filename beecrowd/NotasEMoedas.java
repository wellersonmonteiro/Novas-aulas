package beecrowd;
import java.util.Scanner;
public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        int n100 =0, n50 =0, n20 =0, n10 =0, n5 =0, n2 =0, n1 =0, c50 =0, c25 =0, c10 =0, c5 =0, c1=0;
        while(valor < 0 || valor > 1000000.00 ){
             valor = input.nextDouble();

        }

        if(valor >=100){
            n100 =  (int) Math.floor(valor / 100);
            valor = valor % 100;

        }
        if(valor >= 50){
            n50 =  (int) Math.floor(valor / 50);
            valor = valor % 50;
        }
        if(valor >= 20){
            n20 = (int) Math.floor(valor / 20);
            valor = valor %20;
        }
        if(valor >= 10){
            n10 = (int) Math.floor(valor / 10);
            valor = valor % 10;
        }
        if(valor >= 5){
            n5 = (int) Math.floor(valor / 5);
            valor = valor % 5;
        }
        if(valor >= 2){
            n2 = (int) Math.floor(valor / 2);
            valor = valor % 2;
        }
        if(valor >= 1){
            n1 = (int) Math.floor(valor / 1);
            valor = valor % 1;
        }

        if(valor >= 0.50){
            c50 = (int) Math.floor(valor / 0.50);
            valor = valor % 0.50;
        }
        if(valor >= 0.25){
            c25 = (int) Math.floor(valor / 0.25);
            valor = valor % 0.25;
        }
        if(valor >= 0.10){
            c10 = (int) Math.floor(valor / 0.10);
            valor = valor % 0.10;
        }
        if(valor >= 0.05){
            c5 = (int) Math.floor(valor / 0.05);
            valor = valor % 0.05;
        }
        if(valor >= 0.01){
            c1 = (int) (valor/ 0.01);
        }
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", n1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", c50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", c25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", c10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", c5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", c1);

        }
    }

