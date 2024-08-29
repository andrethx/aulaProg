package aula24.exemploPessoaLista;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String sobrenome;
    private String nome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
