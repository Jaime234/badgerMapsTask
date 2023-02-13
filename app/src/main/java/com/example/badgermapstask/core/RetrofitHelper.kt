package com.example.badgermapstask.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://19h0vwjnce.execute-api.eu-west-3.amazonaws.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}