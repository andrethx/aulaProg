package aula35.ex1;

public abstract class Funcionario {
    private String fuName;
    private float salBase;

    public String getFuName() {
        return fuName;
    }

    public void setFuName(String fuName) {
        this.fuName = fuName;
    }

    public float getSalBase() {
        return salBase;
    }

    public void setSalBase(float salBase) {
        this.salBase = salBase;
    }

    public abstract void calcularSalario();

}

