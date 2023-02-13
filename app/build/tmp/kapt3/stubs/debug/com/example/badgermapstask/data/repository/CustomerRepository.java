package com.example.badgermapstask.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/badgermapstask/data/repository/CustomerRepository;", "", "api", "Lcom/example/badgermapstask/data/network/CustomerService;", "customerProvider", "Lcom/example/badgermapstask/data/model/CustomerProvider;", "(Lcom/example/badgermapstask/data/network/CustomerService;Lcom/example/badgermapstask/data/model/CustomerProvider;)V", "getAllCustomers", "", "Lcom/example/badgermapstask/data/model/CustomerModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CustomerRepository {
    private final com.example.badgermapstask.data.network.CustomerService api = null;
    private final com.example.badgermapstask.data.model.CustomerProvider customerProvider = null;
    
    @javax.inject.Inject()
    public CustomerRepository(@org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.data.network.CustomerService api, @org.jetbrains.annotations.NotNull()
    com.example.badgermapstask.data.model.CustomerProvider customerProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllCustomers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.badgermapstask.data.model.CustomerModel>> continuation) {
        return null;
    }
}