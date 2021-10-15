package com.cards.apirest.services

import com.cards.apirest.models.LoginRequestObject
import org.springframework.stereotype.Service

@Service
class UserService {

//    @Autowired
//    private lateinit var bCryptPasswordEncoder: BCryptPasswordEncoder


    fun validate(user: LoginRequestObject): LoginRequestObject {
        return user
    }

}