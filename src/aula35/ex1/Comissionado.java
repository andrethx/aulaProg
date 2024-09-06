package aula35.ex1;

public class Comissionado extends Funcionario implements Pagamento{
    private float valorHora;
    private float quantHoras;
    private float valorVendas;
    private float percentualComissao;
    private float salario;

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(float quantHoras) {
        this.quantHoras = quantHoras;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public void calcularSalario() {
        setSalBase(valorHora*quantHoras);
        salario = getSalBase()+valorVendas*(percentualComissao/100);
    }

    @Override
    public String processarPagamento() {
        return "Seu salário é de R$"+String.format("%.2f",salario);
    }
}
