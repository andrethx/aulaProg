package aula20.exemploConta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com o nome do titular: ");
        String titular = ler.next();
        System.out.println("entre com o deposito inicial: ");
        Float valor = ler.nextFloat();
        Conta c1 = new Conta(titular, valor);
        System.out.println("conta cadastrada obteve id: "+c1.identificador);
        //criando outra conta
        Conta c2 = new Conta("Jonas",10);
        c1.nomeBanco = "Banco cimol";
        System.out.println("Nome banco c1: "+c1.nomeBanco);
        System.out.println("Nome banco c2: "+c2.nomeBanco);
    }
}

