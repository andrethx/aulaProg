package aula20.exemploAcesso2;

import aula20.exemploAcesso.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //o nome esta sem modificador na classe pessoal, dessa forma a classe
        //principal nao tem acesso a ele
        //p1.nome = "Jonas";
    }
}
