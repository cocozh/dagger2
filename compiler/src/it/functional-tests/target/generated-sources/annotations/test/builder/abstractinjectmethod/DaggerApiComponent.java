package test.builder.abstractinjectmethod;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApiComponent implements ApiComponent {
  private MembersInjector<ContactDataStore> contactDataStoreMembersInjector;
  private MembersInjector<CloudContactDataStore> cloudContactDataStoreMembersInjector;

  private DaggerApiComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ApiComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.contactDataStoreMembersInjector = ContactDataStore_MembersInjector.create(RestClient_Factory.create());
    this.cloudContactDataStoreMembersInjector = MembersInjectors.delegatingTo(contactDataStoreMembersInjector);
  }

  @Override
  public void inject(ContactDataStore contactDataStore) {  
    contactDataStoreMembersInjector.injectMembers(contactDataStore);
  }

  @Override
  public void inject(CloudContactDataStore contactDataStore) {  
    cloudContactDataStoreMembersInjector.injectMembers(contactDataStore);
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ApiComponent build() {  
      return new DaggerApiComponent(this);
    }
  }
}

