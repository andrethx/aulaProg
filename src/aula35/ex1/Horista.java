package aula35.ex1;

public class Horista extends Funcionario implements Pagamento{

    private float valorHora;
    private float quantHoras;

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

    @Override
    public void calcularSalario() {
        setSalBase(valorHora*quantHoras);
    }

    @Override
    public String processarPagamento() {
        return "Realizando o pagamento de R$"+String.format("%.2f",getSalBase());
    }
}
