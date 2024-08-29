package com.alura.compras.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras = new ArrayList<>();

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo += limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (this.getSaldo() > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.sort(Comparator.comparing(Compra::getValor));
            this.compras.add(compra);
            return true;
        }
        return  false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
