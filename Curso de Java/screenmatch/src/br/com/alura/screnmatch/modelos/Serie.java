package br.com.alura.screnmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpsodio;


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public String toString() {
        return super.toString() + this.ativa
                + this.temporadas
                + this.minutosPorEpsodio
                + this.episodioPorTemporada;
    }
}
