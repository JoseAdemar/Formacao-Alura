package br.com.alura.screnmatch.principal;

import br.com.alura.screnmatch.modelos.Filme;
import br.com.alura.screnmatch.modelos.Serie;
import br.com.alura.screnmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(outroFilme);
        lista.add(lost);
        lista.add(filmeDoPaulo);
        lista.add(lost);

       /* for (Titulo item : lista) {
            System.out.println(item);
            System.out.println("**********************************");
        }*/

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jacqueline");

        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Após ordenação \n" + buscaPorArtistas);

        Collections.sort(lista);
        //lista.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        lista.sort(Comparator.comparing(Titulo::getNome));

        System.out.println();
        System.out.println("Lista de titulos ordenados");
        for (Titulo item : lista) {
            System.out.println(item);
            System.out.println("**********************************");
        }
    }
}
