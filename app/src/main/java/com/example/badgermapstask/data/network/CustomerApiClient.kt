package com.example.badgermapstask.data.network

import com.example.badgermapstask.data.model.CustomerModel
import retrofit2.Response
import retrofit2.http.GET

interface CustomerApiClient {
    @GET("MobileInternshipAPI/data")
    suspend fun getAllCustomers():Response<List<CustomerModel>>

}