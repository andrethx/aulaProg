package aula33.exercicioPessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("andré", "haubert"));
        Pessoa p1 = new Pessoa("pedro", "fones");
        lista.add(p1);
        System.out.println(lista);
    }
}
