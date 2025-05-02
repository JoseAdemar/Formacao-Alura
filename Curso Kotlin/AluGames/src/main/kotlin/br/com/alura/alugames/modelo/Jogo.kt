package br.com.alura.alugames.modelo

import java.math.BigDecimal

data class Jogo(var titulo: String, val capa: String, val preco: Double) {
    public var descricao: String? = "";


    override fun toString(): String {
        return "Meu jogo:\n" +
                "Título: $titulo' \n" +
                "Capa: $capa\n" +
                "Preço: $preco\n"
                "Descrição: $descricao"

    }
}