package br.com.alura.screnmatch.principal;

import br.com.alura.screnmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screnmatch.calculos.FiltroRecomendacao;
import br.com.alura.screnmatch.modelos.Epsodio;
import br.com.alura.screnmatch.modelos.Filme;
import br.com.alura.screnmatch.modelos.Serie;
import br.com.alura.screnmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IllegalAccessException {
        Filme filme = new Filme("O podereso chefão", 1970);
        //filme.setAnoDeLancamento(1970);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(180);
        filme.setDiretor("Albert Cooler");

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Soma das avaliações = " + filme.getSomaDasAvaliacoes());
        System.out.println("Quantidade de avaliações =" + filme.getQuantidadeAvaliacoes());
        System.out.println("Média = " + filme.pegaMedia());
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        System.out.println("******************************************");

        Serie lost = new Serie("Lost",2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setDuracaoEmMinutos(100);

        Filme filme2 = new Filme("Avatar", 2022);
        filme2.setAnoDeLancamento(1970);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(180);
        filme2.setDiretor("Albert Cooler");

        calculadoraDeTempo.adicionr(filme);
        calculadoraDeTempo.adicionr(filme2);
        calculadoraDeTempo.adicionr(lost);
        System.out.println("Duração total = " + calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setTotalAvaliacoes(300);
        filtro.filtra(epsodio);

        var filmeDoPaulo = new Filme("Dogville", 2023);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.avalia(10);

        System.out.println("**************************************************");

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(lost);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filmeDoPaulo);

        for(Titulo t : listaDeFilmes){
            System.out.println(t);
        }
    }
}