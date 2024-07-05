package aula21.exBanco;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessa(ContaCorrente c1) {
        String opc;
        System.out.println("acessando a conta " + c1.getIdentificador());
        System.out.println("bem vindo " + c1.getTitular());
        do {
            System.out.println("selecione uma opção");
            System.out.println("d - realizar um deposito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar o saldo");
            System.out.println("a - alterar senha");
            System.out.println("e - sair");
            opc = leString("").toLowerCase();
            switch (opc) {
                case "d" -> {
                    float valor = leFloat("qual valor você deseja depositar");
                    c1.depositar(valor);
                    System.out.println("depósito realizado!");
                }
                case "s" -> {
                    float valor = leFloat("qual o valor do saque?");
                    if (c1.sacar(valor))
                        System.out.println("saque realizado");
                    else
                        System.out.println("saldo mais limite insuficientes");
                }
                case "v" -> System.out.println(c1.verificaSaldo());

                case "a" -> {
                    String senha = leString("qual a nova senha?");
                    c1.setSenha(senha);
                }
            }
        }
        while (!opc.equals("e"));
        return c1;
    }

    public static ContaCorrente cadastraCC() {
        String titular = leString("qual o titular da conta");
        String senha = leString("qual a senha?");
        float limite = leFloat("qual o limite inicial");
        ContaCorrente c1 = new ContaCorrente(titular, senha, limite);
        System.out.println("conta cadastrada com o identificador " + c1.getIdentificador());
        return c1;
    }

    public static ContaPoupanca cadastraCP() {
        String titular = leString("qual o titular da conta");
        String senha = leString("qual a senha?");
        float deposito = leFloat("qual o valor do deposito inicial");
        ContaPoupanca c1 = new ContaPoupanca(titular, senha, deposito);
        System.out.println("conta cadastrada com o identificador " + c1.getIdentificador());
        return c1;
    }


    public static ContaPoupanca acessa(ContaPoupanca c1) {
        //aqui vai teu código
        return c1;
    }

    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaCorrente[] listaCP = new ContaCorrente[20];
        int contCC = 0;
        int contCP = 0;
        String opc;
        do {
            System.out.println("selecione uma opçao");
            System.out.println("cc - cadastrar uma conta corrente");
            System.out.println("cp - cadastrar uma conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar conta poupança");
            System.out.println("e - sair");
            opc = leString("");
            switch (opc) {
                case "cc" -> {
                    listaCC[contCC] = cadastraCC();
                    contCC++;
                }
                case "cp" -> {
                    listaCP[contCP] = cadastraCP();
                    contCP++;
                }
                case "ac" -> {
                    String identificador = leString("qual o identificador");
                    String senha = leString("qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCC; i++) ;
                    if (listaCC[i].validaAcesso(identificador, senha))
                        posicao = i;

                    if (posicao >= 0) {
                        listaCC[posicao] = acessaCC(listaCC[posicao]);
                    } else {
                        System.out.println("conta inexistente ou senha incorreta!");
                    }
                    case "ap" -> String identificador = leString("qual o identificador");
                    String senha = leString("qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCC; i++) ;
                    if (listaCC[i].validaAcesso(identificador, senha))
                        posicao = i;

                    if (posicao >= 0) {
                        listaCC[posicao] = acessaCC(listaCC[posicao]);
                    } else {
                        System.out.println("conta inexistente ou senha incorreta!");
                    }
                }
            }
            while (!opc.equals("e")) ;
        }
    }
}

