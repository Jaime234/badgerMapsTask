package com.example.badgermapstask.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.badgermapstask.data.model.CustomerModel
import com.example.badgermapstask.domain.useCases.GetCostumersOrderedAlphabetically
import com.example.badgermapstask.domain.useCases.GetEarliestCheckInCustomer
import com.example.badgermapstask.domain.useCases.GetJobsOrderedAlphabetically
import com.example.badgermapstask.domain.useCases.GetLastCheckInCustomer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CustomerViewModel @Inject constructor(
    private val getLastCheckInCustomer: GetLastCheckInCustomer,
    private val getEarliestCheckInCustomer: GetEarliestCheckInCustomer,
    private val getCostumersOrderedAlphabetically: GetCostumersOrderedAlphabetically,
    private val getJobsOrderedAlphabetically: GetJobsOrderedAlphabetically
) : ViewModel() {

    val customerModel = MutableLiveData<CustomerModel>()
    val list = MutableLiveData<List<String>>()
    val isLoading = MutableLiveData<Boolean>()

    fun getLatestCheck(){
        viewModelScope.launch{
            isLoading.postValue(true)
            val res = getLastCheckInCustomer()
            customerModel.postValue(res)
            isLoading.postValue(false)
        }
    }

    fun getEarliestCheck(){
        viewModelScope.launch{
            isLoading.postValue(true)
            val res = getEarliestCheckInCustomer()
            customerModel.postValue(res)
            isLoading.postValue(false)
        }
    }

    fun getCostumersOrdered(){
        viewModelScope.launch{
            isLoading.postValue(true)
            val res = getCostumersOrderedAlphabetically()
            list.postValue(res)
            isLoading.postValue(false)
        }
    }

    fun getJobsOrdered(){
        viewModelScope.launch{
            isLoading.postValue(true)
            val res = getJobsOrderedAlphabetically()
            list.postValue(res)
            isLoading.postValue(false)
        }
    }

}