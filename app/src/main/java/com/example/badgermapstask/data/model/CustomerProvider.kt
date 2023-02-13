package com.example.badgermapstask.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomerProvider @Inject constructor(){
        var customers:List<CustomerModel> = emptyList()
}