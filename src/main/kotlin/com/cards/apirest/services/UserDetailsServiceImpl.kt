package com.cards.apirest.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl : UserDetailsService {

    @Autowired
    lateinit var encoder: PasswordEncoder

    override fun loadUserByUsername(username: String?): UserDetails {

        val xxxx = encoder.encode("foo")

        return  User.builder().username("foo").password(xxxx).roles("USER").build()
    }
}