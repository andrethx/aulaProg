package aula20.exemploEncapsulamento;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("qual o nome: ");
        String nome = ler.next();
        System.out.println("qual o sobrenome: ");
        String sobrenome = ler.next();
        Pessoa pessoaUm = new Pessoa(nome, sobrenome);
        System.out.println("nome: "+pessoaUm.getNome());
        System.out.println("Sobrenome: "+pessoaUm.getSobrenome());
    }
}
