package aula35.exInterface;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);

        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        v1.adiciona("D");
        System.out.println("Qual é o tamanho da lista "+v1.getTamanho());
        System.out.println(v1);
        System.out.println("Removendo o elemento "+v1.remove());
        System.out.println(v1);

        Lista l1 = new Vetor(5);
        l1.adiciona("Teste");
        l1.remove();
        //esse método não está disponivel em lista, então não estara disponivel
        //l1.getTamanho();
    }
}