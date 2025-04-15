package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {
    public static void main(String[] args) {

        var cliente = new Cliente("João");
        var conta = new Conta(cliente, new BigDecimal("150"));

        var operacao = new OperacaoSaque(conta, new BigDecimal("150"));

        System.out.println(Thread.currentThread().getName());

        Thread saqueJoao = new Thread(operacao);
        Thread saqueMaria = new Thread(operacao);

        saqueJoao.start();
        saqueMaria.start();

        try {
            saqueJoao.join();
            saqueMaria.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Saldo final: " + conta.getSaldo());

        System.out.println(Thread.currentThread().getName());
    }
}
