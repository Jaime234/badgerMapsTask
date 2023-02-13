package com.example.badgermapstask.domain.useCases

import com.example.badgermapstask.data.repository.CustomerRepository
import javax.inject.Inject

class GetJobsOrderedAlphabetically @Inject constructor(private val repository: CustomerRepository) {

    suspend operator fun invoke(): List<String> {

        val customers = repository.getAllCustomers()

        val nonNullCustomers = customers.filter {
            it.job != null
        }

        return nonNullCustomers.map { "${it.job}" }.sorted()
    }

}