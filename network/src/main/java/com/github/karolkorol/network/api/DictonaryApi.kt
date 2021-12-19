package com.github.karolkorol.network.api

import com.github.karolkorol.network.dto.WordInfoDto
import io.ktor.client.*
import io.ktor.client.request.*

class DictonaryApi(private val client: HttpClient) {

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en"
    }

    suspend fun getWordInfo(word: String): List<WordInfoDto> {
        return client.get {
            url("$BASE_URL/$word")
        }
    }
}