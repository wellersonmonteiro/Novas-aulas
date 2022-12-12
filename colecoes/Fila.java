package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String>  fila = new LinkedList<>();
        // Offer e Add -> adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("carlos");
        fila.add("Daniel");
        fila.add("Rafael");
        fila.add("Gui");

        // Peek e Element -> obter o próximo elemento
        // da fila sem remover

        // A diferença é o comportamento ocorre
        //quando a fila está vazia!

        System.out.println(fila.peek());// Retorna false
        System.out.println(fila.peek());// Lança uma exceção

        // fila.size();
        //fila.clear();
        // fila.isEmpty():
        // fila.contains(..);

        // Poll e remove -> obter o próximo elemento
        // da e remove

        // A diferença é o comportamento ocorre
        //quando a fila está vazia!
        System.out.println(fila.poll());//Retorna false
        System.out.println(fila.poll());// Retorna uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
