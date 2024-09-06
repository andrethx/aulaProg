package aula35.exAbstrato;

public abstract class Figura {

    private String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    @Override
    public String toString() {
        String retorno = "Nome: " + nomeFigura;
        retorno += "\nArea " + calculaArea();
        retorno += "\nPerimetro: " + calculaPerimetro();
        return retorno;
    }
}
