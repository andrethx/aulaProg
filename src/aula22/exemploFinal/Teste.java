package aula22.exemploFinal;

public class Teste {
    public static void main(String[] args) {
        Exemplo1 ex = new Exemplo1();
        //nao é possivel alterar um valor de um atributo final
        //ex.numero = 25;
        //lendo o valor de uma constante
        System.out.println(Exemplo1.PI);
    }
}
