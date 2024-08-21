package Atividade3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestaArrayMultidimenscional {
    public static void main(String[] args) {
        int[][] tabela;
        int[][] cubo[];

        tabela = new int[10][5];
        cubo = new int[10][][];

        int[][] teste = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < teste.length; i++) {
            for (int j = 0; j < teste[i].length; j++) {
                System.out.print("|" + teste[i][j]);
            }
            System.out.println();
        }
    }
}