package arrays;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas:");
        double quantidadeDeNotas = entrada.nextDouble();

        double[] arrayNotas = new double[(int) quantidadeDeNotas];
        for (int i = 0; i < arrayNotas.length; i++) {
            System.out.println("Digite o valor da nota"+ (i + 1) + ":");
            arrayNotas[i] = entrada.nextDouble();

        }
        double total = 0;
        for(double nota : arrayNotas){
            total += nota;
        }
        System.out.println("A média será"+ " " + total / arrayNotas.length);
        entrada.close();
    }
}
