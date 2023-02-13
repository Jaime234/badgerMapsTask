package com.example.badgermapstask.domain.useCases

import com.example.badgermapstask.data.model.CustomerModel
import com.example.badgermapstask.data.model.CustomerProvider
import com.example.badgermapstask.data.repository.CustomerRepository
import java.text.Normalizer
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.inject.Inject

class GetCostumersOrderedAlphabetically @Inject constructor(private val repository: CustomerRepository) {

    suspend operator fun invoke(): List<String> {

        val customers = repository.getAllCustomers()

        val nonNullCustomers = customers.filter {
            it.firstName != null && it.lastName != null
        }

        return nonNullCustomers.map { "${Normalizer.normalize(it.firstName, Normalizer.Form.NFD)} ${Normalizer.normalize(it.lastName, Normalizer.Form.NFD)}" }.sorted()
    }
}