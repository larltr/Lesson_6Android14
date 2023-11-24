package com.angelika.lesson_6android14.data.repositories

import android.util.Log
import com.angelika.lesson_6android14.data.remote.apiservice.HarryPotterApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HarryPotterRepository @Inject constructor(
    private val harryPotterApiService: HarryPotterApiService
) {

    fun fetchChacacters() = flow {
        try {
            emit(harryPotterApiService.fetchCharacters())
        } catch (exception: Exception) {
            Log.e("TAG", "fetchChacacters: ")
        }
    }
}