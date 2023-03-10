// Generated by Dagger (https://dagger.dev).
package com.example.badgermapstask.domain.useCases;

import com.example.badgermapstask.data.repository.CustomerRepository;
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
public final class GetJobsOrderedAlphabetically_Factory implements Factory<GetJobsOrderedAlphabetically> {
  private final Provider<CustomerRepository> repositoryProvider;

  public GetJobsOrderedAlphabetically_Factory(Provider<CustomerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetJobsOrderedAlphabetically get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetJobsOrderedAlphabetically_Factory create(
      Provider<CustomerRepository> repositoryProvider) {
    return new GetJobsOrderedAlphabetically_Factory(repositoryProvider);
  }

  public static GetJobsOrderedAlphabetically newInstance(CustomerRepository repository) {
    return new GetJobsOrderedAlphabetically(repository);
  }
}
