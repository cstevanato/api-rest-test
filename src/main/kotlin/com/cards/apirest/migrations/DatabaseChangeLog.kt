package com.cards.apirest.migrations

import com.cards.apirest.repository.CardRepository
import io.mongock.api.annotations.ChangeUnit
import io.mongock.api.annotations.Execution

import org.slf4j.LoggerFactory

@ChangeUnit(id = "client-initializeer", order = "001")
//@Profile("dev")
//@ChangeLog
class DatabaseChangeLog(
//    private val cardRepository: CardRepository
) {

    private val logger: org.slf4j.Logger = LoggerFactory.getLogger(DatabaseChangeLog::class.java)

//    @ChangeSet(order = "001", id = "seedDatabase", author = "Sai")
    @Execution
    fun initializationData() {
//        logger.info("Teste Passando inicializnado ")
//        cardRepository.deleteAll()
    }

//    @RollbackExecution
//    fun rollback() {
//
//    }

//    private fun add0001() {
//        logger.info("Teste Passando 0001 ")
//        val card: Card = Card("0000001", "Card 0001")
//        cardRepository.save(card)
//    }
//
//    private fun add0002() {
//        logger.info("Teste Passando 0003 ")
//
//        val card: Card = Card("0000002", "Card 0002")
//        cardRepository.save(card)
//    }


}