package br.com.alura.screnmatch.modelos;

public class Filme extends Titulo{

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
}
