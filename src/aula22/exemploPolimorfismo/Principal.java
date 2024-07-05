package aula22.exemploPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        Aluno a1 = new Aluno();
        a1.setNome("ana");
        a1.setSobrenome("Silva");
        a1.setMatricula("324545");
        System.out.println(p1.obterDados());
        System.out.println(p1);
        System.out.println(a1.obterDados());
        System.out.println(a1);
    }
}
