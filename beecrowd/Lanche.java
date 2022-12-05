package beecrowd;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int item, quantidade;
        double total;
        item = scn.nextInt();
        quantidade = scn.nextInt();

        if (item == 1){
            total = 4 * quantidade;
            System.out.printf("Total: R$ %.2f ",total);
        } else if (item == 2) {
            total = 4.5 * quantidade;
            System.out.printf("Total: R$ %.2f ",total);
        }
        else if (item == 3) {
            total = 5 * quantidade;
            System.out.printf("Total: R$ %.2f ",total);
        }
        else if (item == 4) {
            total = 2 *quantidade;
            System.out.printf("Total: R$ %.2f ",total);
        }
        else if (item == 5) {
            total = 1.5 * quantidade;
            System.out.printf("Total: R$ %.2f ",total);
        }



    }
}
