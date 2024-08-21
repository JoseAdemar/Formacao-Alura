package Atividade4;

import java.util.ArrayList;
import java.util.List;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Francisco");

        for(String n : nomes){
            System.out.println(n);
        }

        List<String> sobreNome = new ArrayList<>();
        sobreNome.add("Oliveira");
        sobreNome.add("Silva");

        for (String s : sobreNome){
            System.out.println(s);
        }
        
        //Convertendo um ArrayList em Array
        Object[] objects = nomes.toArray(); //Converte para um array de objetos caso eu quero para um tipo específico
        //posso utilizar dessa forma:
        String[] strings = nomes.toArray(new String[nomes.size()]);//transforma em um array com tipo específico

        //juntando dois arrays
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Coreia");

        ArrayList<String> tudo = new ArrayList<>();
        tudo.addAll(nomes);
        tudo.addAll(paises);

        for(String t : tudo){
            System.out.println(t);
        }


    }
}
