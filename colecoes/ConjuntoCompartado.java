package colecoes;

import java.util.*;

public class ConjuntoCompartado {
    public static void main(String[] args) {

        SortedSet<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");
        for (String canditado: lista){
            System.out.println(canditado);
        }
    }


}
