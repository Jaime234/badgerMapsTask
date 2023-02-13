package com.example.badgermapstask.presentation.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/badgermapstask/presentation/viewModel/CustomerViewModel;", "Landroidx/lifecycle/ViewModel;", "getLastCheckInCustomer", "Lcom/example/badgermapstask/domain/useCases/GetLastCheckInCustomer;", "getEarliestCheckInCustomer", "Lcom/example/badgermapstask/domain/useCases/GetEarliestCheckInCustomer;", "getCostumersOrderedAlphabetically", "Lcom/example/badgermapstask/domain/useCases/GetCostumersOrderedAlphabetically;", "getJobsOrderedAlphabetically", "Lcom/example/badgermapstask/domain/useCases/GetJobsOrderedAlphabetically;", "(Lcom/example/badgermapstask/domain/useCases/GetLastCheckInCustomer;Lcom/example/badgermapstask/domain/useCases/GetEarliestCheckInCustomer;Lcom/example/badgermapstask/domain/useCases/GetCostumersOrderedAlphabetically;Lcom/example/badgermapstask/domain/useCases/GetJobsOrderedAlphabetically;)V", "customerModel", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/badgermapstask/data/model/CustomerModel;", "getCustomerModel", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "", "list", "", "", "getList", "getCostumersOrdered", "", "getEarliestCheck", "getJobsOrdered", "getLatestCheck", "app_debug"})
public final class CustomerViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.badgermapstask.domain.useCases.GetLastCheckInCustomer getLastCheckInCustomer = null;
    private final com.example.badgermapstask.domain.useCases.GetEarliestCheckInCustomer getEarliestCheckInCustomer = null;
    private final com.example.badgermapstask.domain.useCases.GetCostumersOrderedAlphabetically getCostumersOrderedAlphabetically = null;
    private final com.example.badgermapstask.domain.useCases.GetJobsOrderedAlphabetically getJobsOrderedAlphabetically = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.badgermapstask.data.model.CustomerModel> customerModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public CustomerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.domain.useCases.GetLastCheckInCustomer getLastCheckInCustomer, @org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.domain.useCases.GetEarliestCheckInCustomer getEarliestCheckInCustomer, @org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.domain.useCases.GetCostumersOrderedAlphabetically getCostumersOrderedAlphabetically, @org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.domain.useCases.GetJobsOrderedAlphabetically getJobsOrderedAlphabetically) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.badgermapstask.data.model.CustomerModel> getCustomerModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void getLatestCheck() {
    }
    
    public final void getEarliestCheck() {
    }
    
    public final void getCostumersOrdered() {
    }
    
    public final void getJobsOrdered() {
    }
}