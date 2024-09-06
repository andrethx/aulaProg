package aula35.exAbstrato;

public class Circulo extends Figura {
    private double raio;

    public Circulo(){
        super.setNomeFigura("Circulo");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }
}
