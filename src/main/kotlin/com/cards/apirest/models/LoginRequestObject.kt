package com.cards.apirest.models

data class LoginRequestObject(
    //@SerializedName("cpf")
    val cpf: String,
    //@SerializedName("password")
    val password: String
)
