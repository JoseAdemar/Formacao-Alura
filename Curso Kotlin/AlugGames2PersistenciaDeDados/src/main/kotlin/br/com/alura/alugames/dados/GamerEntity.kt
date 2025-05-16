package br.com.alura.alugames.dados

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GenerationType

@Entity
@Table(name = "gamers")
class GamerEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    val nome: String = "Nome do Gamer",
    val email: String = "email@email.com",
    val dataNascimento: String? = null,
    val usuario: String? = null
) {
}