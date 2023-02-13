package com.example.badgermapstask.domain.useCases

import com.example.badgermapstask.data.model.CustomerModel
import com.example.badgermapstask.data.repository.CustomerRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.inject.Inject

class GetLastCheckInCustomer @Inject constructor( private val repository: CustomerRepository) {

    suspend operator fun invoke(): CustomerModel {

        val customers = repository.getAllCustomers()

        val formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]", Locale.getDefault());

        val nonNullCustomers = customers.filter {
            it.lastCheckInDate != null && it.lastCheckInDate != ""
        }

        return nonNullCustomers.maxBy { LocalDate.parse(it.lastCheckInDate, formatter) }
    }
}