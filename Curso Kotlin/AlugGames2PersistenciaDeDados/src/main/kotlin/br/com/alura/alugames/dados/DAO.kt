package br.com.alura.alugames.dados

import javax.persistence.EntityManager

abstract class DAO<TModel, TEntity>(protected val manager: EntityManager, protected val entityType: Class<TEntity>) {

    abstract fun toEntity(objeto: TModel): TEntity
    abstract fun toModel(entity: TEntity): TModel

    open fun getLista(): List<TModel> {
        val query = manager.createQuery("FROM ${entityType.simpleName}", entityType)
        return query.resultList.map { entity -> toModel(entity) }
    }

    open fun adicionar(objeto: TModel) {
        val entity = toEntity(objeto)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }

    open fun editar(id: Int, objetoAtualizado: TModel) {
        val entidadeExistente = manager.find(entityType, id)
        if (entidadeExistente != null) {
            // Converte o objeto atualizado para entidade
            val novaEntidade = toEntity(objetoAtualizado)

            // Copia os campos atualizados da nova entidade para a existente
            copiarCampos(novaEntidade, entidadeExistente)

            // Faz o merge com o banco
            manager.transaction.begin()
            manager.merge(entidadeExistente)
            manager.transaction.commit()
        }
    }

    private fun copiarCampos(origem: TEntity, destino: TEntity) {
        val campos = entityType.declaredFields
        campos.forEach { campo ->
            campo.isAccessible = true
            if (campo.name != "id") { // Evita sobrescrever o ID
                val valor = campo.get(origem)
                campo.set(destino, valor)
            }
        }
    }

    open fun recuperarPorId(id: Int): TModel {
        val query = manager.createQuery("FROM ${entityType.simpleName} WHERE id=:id", entityType)
        query.setParameter("id", id)
        val entity = query.singleResult
        return toModel(entity)
    }

    open fun apagar(id: Int) {
        val query = manager.createQuery("FROM ${entityType.simpleName} WHERE id=:id", entityType)
        query.setParameter("id", id)
        val entity = query.singleResult

        if (entity != null) {
            manager.transaction.begin()
            manager.remove(entity)
            manager.transaction.commit()
        }

    }
}