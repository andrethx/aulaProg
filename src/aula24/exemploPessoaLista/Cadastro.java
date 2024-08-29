package aula24.exemploPessoaLista;

import java.io.*;
import java.util.Scanner;

public class Cadastro {
    static File caminho = new File("C:\\Users\\Andre\\Documents");
    static File arquivo = new File(caminho, "pessoas.db");


    public static Pessoa[] leArquivo() {
        Pessoa[] lista = new Pessoa[10];
        try {
            ObjectInputStream leitura =
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            lista = (Pessoa[]) leitura.readObject();
            leitura.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (ClassNotFoundException e) {
            System.out.println("classe não encontrada");
        }
        return lista;
    }

    public static void gravaArquivo(Pessoa[] lista) {
        try {
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            escrita.writeObject(lista);
            escrita.close();
        }
        catch (IOException e){
            System.out.println("erro ao gravar o arquivo");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa[] lista = leArquivo();
        //criando o contador de pessoas
        int cont = 0;
        Pessoa p;
        do {
            p = lista[cont];
            if (p != null) {
                cont++;
            }
        }
        while (p != null);
        String opc;
        do {
            System.out.println("c = cadastrar");
            System.out.println("l = listar");
            System.out.println("e = sair");
            opc = ler.next().toLowerCase();
            switch (opc) {
                case "c" -> {
                    Pessoa p1 = new Pessoa();
                    System.out.println("qual o nome da pessoa: ");
                    p1.setNome(ler.next());
                    System.out.println("qual o sobrenome: ");
                    p1.setSobrenome(ler.next());
                    lista[cont] = p1;
                    cont++;
                }
                case "l" -> {
                    for (int i = 0; i < cont; i++) {
                        System.out.println(lista[i]);
                    }
                }
                case "e" -> {
                    gravaArquivo(lista);
                }
            }
        }
        while (!opc.equals("e"));
    }
}
