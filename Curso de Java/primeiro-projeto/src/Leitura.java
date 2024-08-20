import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = scanner.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = scanner.nextInt();

        System.out.println("Digite a sua avaliação");
        double avaliacao = scanner.nextDouble();

        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("Ano do filme: " + anoLancamento);
        System.out.println("Sua avaliação foi: " + avaliacao);
    }
}
