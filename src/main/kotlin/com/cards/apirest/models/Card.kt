package com.cards.apirest.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Document(collection = "cards")
data class Card(
    @Id
    val id: String,

    @NotBlank
    @Size(max = 100)
    val name: String
)