package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos:");
        int alunos = entrada.nextInt();


        System.out.println("Quantas notas por aluno:");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[alunos][quantidadeNotas];

        entrada.close();
    }
}
