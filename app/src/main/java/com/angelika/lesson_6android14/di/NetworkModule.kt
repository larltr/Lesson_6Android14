package com.angelika.lesson_6android14.di

import com.angelika.lesson_6android14.data.remote.RetrofitClient
import com.angelika.lesson_6android14.data.remote.apiservice.HarryPotterApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient: RetrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideHarryPotterApiService(): HarryPotterApiService = retrofitClient.harryPotterApiService
}