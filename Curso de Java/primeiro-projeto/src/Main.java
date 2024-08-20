import javax.print.attribute.standard.Media;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de lançamento do filme: " +anoDeLancamento);

        boolean incluidoNoPlano = false;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.printf("%.2f", media);

        String sinopse = """
                Filme Top Gun
                Filme de aventura com atriz dos anos  80
                Muito bom!
                Ano de lançamento""" + " " + anoDeLancamento + " Media do filme " + media;

        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println("Média da classificação: " + classificacao);
    }
}
