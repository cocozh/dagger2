package test.builder.product;

import dagger.MembersInjector;
import javax.annotation.Generated;
import test.builder.abstractinjectmethod.ApiComponent;
import test.builder.abstractinjectmethod.ContactDataStore;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApiComponent implements ApiComponent {
  private MembersInjector<ContactDataStore> contactDataStoreMembersInjector;

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
  }

  @Override
  public void inject(ContactDataStore contactDataStore) {  
    contactDataStoreMembersInjector.injectMembers(contactDataStore);
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ApiComponent build() {  
      return new DaggerApiComponent(this);
    }
  }
}

