package aula22.exemploPolimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("somando dois numeros: "+op.soma(5,6));
        System.out.println("somando tres numeros: "+op.soma(6,7,1));
        System.out.println("somando duas strings: "+op.soma("palavra","casa"));

    }
}
