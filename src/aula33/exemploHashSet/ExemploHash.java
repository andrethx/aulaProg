package aula33.exemploHashSet;

import java.util.HashSet;

public class ExemploHash {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Tomates");
        lista.add("Arroz");
        System.out.println(lista);
    }
}
