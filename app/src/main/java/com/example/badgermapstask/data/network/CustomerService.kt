package com.example.badgermapstask.data.network

import com.example.badgermapstask.core.RetrofitHelper
import com.example.badgermapstask.data.model.CustomerModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CustomerService @Inject constructor(private val api : CustomerApiClient) {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCustomers():List<CustomerModel>{
        return withContext(Dispatchers.IO) {
            val res = api.getAllCustomers()
            res.body() ?: emptyList()
        }
    }
}