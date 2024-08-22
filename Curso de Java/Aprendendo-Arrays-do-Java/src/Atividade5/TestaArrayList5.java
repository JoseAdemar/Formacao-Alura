package Atividade5;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Ruby");
        linguagens.add("Scala");

        Iterator<String> iterator = linguagens.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
