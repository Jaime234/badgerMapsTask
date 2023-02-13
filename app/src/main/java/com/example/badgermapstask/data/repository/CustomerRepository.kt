package com.example.badgermapstask.data.repository

import com.example.badgermapstask.data.model.CustomerModel
import com.example.badgermapstask.data.model.CustomerProvider
import com.example.badgermapstask.data.network.CustomerService
import javax.inject.Inject


class CustomerRepository @Inject constructor(private val api : CustomerService, private val customerProvider: CustomerProvider ){

    suspend fun getAllCustomers(): List<CustomerModel>{
        val res = api.getCustomers()
        customerProvider.customers = res
        return res
    }
}