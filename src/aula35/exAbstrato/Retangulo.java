package aula35.exAbstrato;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(){
        super.setNomeFigura("Retangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2*base+2*altura;
    }
}
