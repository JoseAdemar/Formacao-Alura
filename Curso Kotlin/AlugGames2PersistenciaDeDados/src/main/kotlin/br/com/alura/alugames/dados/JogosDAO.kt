package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Jogo
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager) : DAO<Jogo, JogoEntity>(manager, JogoEntity::class.java ) {

    override fun toModel(entity: JogoEntity): Jogo {
        return Jogo(entity.titulo, entity.capa, entity.preco, entity.descricao?:"", entity.id)
    }

    override fun toEntity(objeto: Jogo): JogoEntity {
        return JogoEntity(objeto.titulo, objeto.capa, objeto.preco, objeto.descricao, objeto.id)
    }

    /*
    fun getJogos(): List<Jogo> {
        val listaJogos = mutableListOf<Jogo>()
        val conexao = Banco.obterConexao()

        if (conexao != null) {
            try {
                val statement = conexao.createStatement()
                val resultado = statement.executeQuery("SELECT * FROM jogos")
                while (resultado.next()) {
                    val id = resultado.getInt("id")
                    val titulo = resultado.getString("titulo")
                    val capa = resultado.getString("capa")
                    val descricao = resultado.getString("descricao")
                    val preco = resultado.getDouble("preco")

                    val jogo = Jogo(titulo, capa, preco, descricao, id)
                    listaJogos.add(jogo)
                }
                statement.close()
            } finally {
                conexao.close()
            }
        }
        return listaJogos
    }

    fun adicionarJogo(jogo: Jogo) {
        val conexao = Banco.obterConexao()
        val insert = "INSERT INTO jogos (CAPA, DESCRICAO, PRECO, TITULO) VALUES (?, ?, ?, ?)"

        if (conexao != null) {
            try {
                val statement = conexao.prepareStatement(insert)
                statement.setString(1, jogo.capa)
                statement.setString(2, jogo.descricao)
                statement.setDouble(3, jogo.preco)
                statement.setString(4, jogo.titulo)

                statement.executeUpdate()
                statement.close()

            } finally {
                conexao.close()
            }
        }
    }
     */
}