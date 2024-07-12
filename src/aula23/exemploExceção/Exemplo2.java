package aula23.exemploExceção;

public class Exemplo2 {
    public int divide (int n1, int n2)throws ArithmeticException{
        if (n2 == 0 )
            throw new ArithmeticException("nao é possivel dividir por 0");
        return n1/n2;
    }
}
