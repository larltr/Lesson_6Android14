package com.angelika.lesson_6android14.data.repositories

import com.angelika.lesson_6android14.data.remote.apiservice.HarryPotterApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HarryPotterRepository @Inject constructor(
    private val harryPotterApiService: HarryPotterApiService
) {


}