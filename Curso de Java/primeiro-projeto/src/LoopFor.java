import java.util.Locale;
import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final int divisor = 3;

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < divisor; i++) {
            System.out.println("Digite sua nota de avaliação para o filme");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação do filme é: " + mediaAvaliacao/divisor);
    }
}
