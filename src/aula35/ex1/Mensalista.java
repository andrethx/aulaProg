package aula35.ex1;

public class Mensalista extends Funcionario implements Pagamento{

    private float valorDia;
    private float quantDias;

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public float getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(float quantDias) {
        this.quantDias = quantDias;
    }

    @Override
    public void calcularSalario() {
        setSalBase(valorDia*quantDias);
    }

    @Override
    public String processarPagamento() {
        return "Realizando o pagamento de R$"+String.format("%.2f",getSalBase());
    }
}
