package br.com.alura.screnmatch.calculos;

import br.com.alura.screnmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void adicionr(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
