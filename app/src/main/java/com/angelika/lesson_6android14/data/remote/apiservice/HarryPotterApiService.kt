package com.angelika.lesson_6android14.data.remote.apiservice

import retrofit2.http.GET

interface HarryPotterApiService {

    @GET("characters")
    suspend fun fetchCharacters()
}