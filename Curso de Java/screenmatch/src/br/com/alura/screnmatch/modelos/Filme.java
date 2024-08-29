package br.com.alura.screnmatch.modelos;

import br.com.alura.screnmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoLancamento){
        super(nome, anoLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return super.toString() + "Diretor: " + this.diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
