package com.example.badgermapstask.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.badgermapstask.databinding.ActivityMainBinding
import com.example.badgermapstask.presentation.viewModel.CustomerViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val customerViewModel : CustomerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        customerViewModel.customerModel.observe(this, Observer{
            binding.costumerName.text = it.firstName + " " + it.lastName
        })

        customerViewModel.list.observe(this, Observer {
            binding.recyclerView.layoutManager = LinearLayoutManager(this)
            binding.recyclerView.adapter = ListAdapter(it)
        })

        customerViewModel.isLoading.observe(this, Observer {
            binding.progressBar.isVisible = it
        })

        binding.latestCheckButton.setOnClickListener {
            binding.recyclerView.isVisible = false
            binding.costumerName.isVisible = true
            customerViewModel.getLatestCheck()
        }

        binding.earliestCheckButton.setOnClickListener {
            binding.recyclerView.isVisible = false
            binding.costumerName.isVisible = true
            customerViewModel.getEarliestCheck()
        }

        binding.orderNamesButton.setOnClickListener{
            binding.recyclerView.isVisible = true
            binding.costumerName.isVisible = false
            customerViewModel.getCostumersOrdered()
        }

        binding.orderJobsButton.setOnClickListener{
            binding.recyclerView.isVisible = true
            binding.costumerName.isVisible = false
            customerViewModel.getJobsOrdered()
        }
    }
}