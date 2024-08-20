import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                ** Digite a sua opção **
                [1] Consultar saldo
                [2] Transferir valor
                [3] Receber valor
                [4] Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo atualizado é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor da transferência: ");
                double transferir = scanner.nextDouble();
                if (saldo >= transferir) {
                    System.out.println("Transferido R$" + transferir);
                    System.out.println("Seu saldo é de: R$ " + (saldo -= transferir));
                } else if (saldo < transferir) {
                    System.out.println("Seu saldo é insuficiente");
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor para transferência:");
                double depositar = scanner.nextDouble();
                System.out.println("Recebido o valor de R$ " + depositar);
                System.out.println("Seu saldo é de R$ " + (saldo += depositar));
            } else if (opcao == 4) {
                System.out.println("Operação encerrada");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}

