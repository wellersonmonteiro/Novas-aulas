package beecrowd;

import java.util.Scanner;

public class nova {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B , C, aa, ab, ac, ad, ae, pi;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        pi = 3.14159;
        aa = (A * C)/ 2;
        ab = pi * Math.pow(C, 2);
        ac = ((A + B) * C) / 2;
        ad = B * B;
        ae = A * B;
        System.out.printf("Triangulo: %.3f",aa  );
        System.out.printf("CIRCULO: %.3f",ab  );
        System.out.printf("TRAPEZIO: %.3f", ac );
        System.out.printf("QUADRADO: %.3f", ad );
        System.out.printf("RETANGULO: %.3f", ae );
    }
    }

