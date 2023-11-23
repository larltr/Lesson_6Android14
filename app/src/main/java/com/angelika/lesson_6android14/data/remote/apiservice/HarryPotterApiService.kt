package com.angelika.lesson_6android14.data.remote.apiservice

import com.angelika.lesson_6android14.models.HarryPotterResponse
import retrofit2.http.GET

interface HarryPotterApiService {

    @GET("characters")
    suspend fun fetchCharacters() : HarryPotterResponse
}