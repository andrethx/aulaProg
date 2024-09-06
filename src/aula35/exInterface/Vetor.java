package aula35.exInterface;

/**
 * classe que representa uma lista elementos
 * @author André
 * @version 1
 * @since 1
 */

public class Vetor implements Lista {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * método que permite dicionar um elemento no final da lista
     * @param elemento elemento que será adicionado
     */

    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    /**
     * método que remove o último elemento da lista
     * @return elemento que foi removido
     */

    @Override
    public String remove() {
        if (tamanho > 0) {
            return elementos[--tamanho];
        }
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }

    //o método retorna uma String com a lista
    //@return[] //caso a lista esteja vazia

    @Override
    public String toString() {
        String resultado = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                resultado += elementos[i] + ", ";
            }

            resultado += elementos[tamanho - 1];

        }
        resultado += "]";
        return resultado;
    }
}
