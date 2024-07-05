package aula22.exemploFinal;

public class Exemplo1 {
    //declarando uma variavel do tipo final
    final double numero;
    //criando uma constante, ela deve receber um valor no momento da declaração
    //acesso universal -> public
    //existe independente da criação de instância -> static
    //não pode ser modificada -> final
    public static final double PI = 3.141592653589793;

    // como nao foi definifo um valor no momento da declaração, este valor
    // deverá ser atribuido até o final do contrutor
    public Exemplo1(){
        numero = 10;
    }
}
