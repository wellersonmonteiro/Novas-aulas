package arrays;

import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        Arrays.toString(notasAlunoA);
        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            System.out.println(i);
            total += notasAlunoA[i];

        }
        System.out.println(total / 3);
        double[] notasAlunoB = {6.9,8.9,5.5,10};
        for (int i = 0; i < notasAlunoB.length; i++) {
            
        }








    }
}
