package atividade2;

public class TestaArray2 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
            System.out.println(clientes[i].nome);
        }
        System.out.println("****************************************");
        for (Cliente c : clientes) {
            System.out.println(c.nome);
        }
    }
}
class Cliente {
    String nome;
}