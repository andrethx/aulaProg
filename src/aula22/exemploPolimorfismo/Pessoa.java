package aula22.exemploPolimorfismo;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
//se o metodo obterDados for final ele não poderá ter o comportamento
    //substituido em outra class, ou seja ele recebe override
    public String obterDados(){
        return "nome: "+nome+" "+sobrenome;
    }

    @Override
    public String toString(){
        return "Nome "+nome+" "+sobrenome;
    }
}
