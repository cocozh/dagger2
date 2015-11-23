package test.builder.product;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.builder.abstractinjectmethod.ContactDataStore;
import test.builder.abstractinjectmethod.RestClient;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ContactDataStore_MembersInjector implements MembersInjector<ContactDataStore> {
  private final Provider<RestClient> restClientProvider;

  public ContactDataStore_MembersInjector(Provider<RestClient> restClientProvider) {  
    assert restClientProvider != null;
    this.restClientProvider = restClientProvider;
  }

  @Override
  public void injectMembers(ContactDataStore instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.setRestClient(restClientProvider.get());
  }

  public static MembersInjector<ContactDataStore> create(Provider<RestClient> restClientProvider) {  
      return new ContactDataStore_MembersInjector(restClientProvider);
  }
}

