import java.util.Locale;
import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int totalNotas = 0;

        double mediaAvaliacao = 0;
        double nota = 0;


        while (nota != -1) {
            System.out.println("Digite sua nota de avaliação ou digite -1 para sair");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            } else {
                System.out.println("Programa finalizado");
            }

        }

        if (mediaAvaliacao <= 0 && totalNotas <= 0) {
            System.out.println("Não foi digitada nenhuma nota");
        } else {
            System.out.println("Média de avaliação do filme é: " + mediaAvaliacao / totalNotas);
        }
    }
}
