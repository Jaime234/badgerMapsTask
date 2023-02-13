package com.example.badgermapstask.di

import com.example.badgermapstask.data.network.CustomerApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://19h0vwjnce.execute-api.eu-west-3.amazonaws.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideCustomerApiClient(retrofit: Retrofit): CustomerApiClient{
        return retrofit.create(CustomerApiClient::class.java)
    }
}