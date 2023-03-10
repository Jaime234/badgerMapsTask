// Generated by Dagger (https://dagger.dev).
package com.example.badgermapstask.data.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomerService_Factory implements Factory<CustomerService> {
  private final Provider<CustomerApiClient> apiProvider;

  public CustomerService_Factory(Provider<CustomerApiClient> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public CustomerService get() {
    return newInstance(apiProvider.get());
  }

  public static CustomerService_Factory create(Provider<CustomerApiClient> apiProvider) {
    return new CustomerService_Factory(apiProvider);
  }

  public static CustomerService newInstance(CustomerApiClient api) {
    return new CustomerService(api);
  }
}
