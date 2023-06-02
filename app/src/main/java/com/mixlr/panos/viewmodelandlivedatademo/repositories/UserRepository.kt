package com.mixlr.panos.viewmodelandlivedatademo.repositories

import com.mixlr.panos.viewmodelandlivedatademo.models.User
import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers(): List<User> {
        delay(8_000)
        return listOf(
            User(1, "Panos"),
            User(2, "Mary"),
            User(3, "Peter"),
            User(4, "George")
        )
    }
}