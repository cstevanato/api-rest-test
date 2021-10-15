package com.cards.apirest.repository

import com.cards.apirest.models.Card
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
interface CardRepository: MongoRepository<Card, String> {

//    fun  findId(id: String): Optional<Card>
}