package aula23.exemploArquivo;

import java.io.*;

public class GravarPessoa {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\Andre\\Documents\\aula23");

        if (!caminho.exists()) {
            System.out.println("caminho não existe, tentando criar...");
            caminho.mkdir();
            System.out.println("[ok]");
        }
        File arquivo = new File(caminho, "pessoas.db");
        try {
            ObjectOutputStream objEscrita =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            //criando instancia de pessoa para escrever dentro do arquivo
            Pessoa p1 = new Pessoa();
            p1.setNome("jonas");
            p1.setSobrenome("silva");
            //escrevendo p1 dentro do arquivo...
            objEscrita.writeObject(p1);
            objEscrita.close();


        } catch (FileNotFoundException e) {
            System.out.println("arquivo nao encontrado, ou nao pode ser criado!");
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo");
        }
    }
}
