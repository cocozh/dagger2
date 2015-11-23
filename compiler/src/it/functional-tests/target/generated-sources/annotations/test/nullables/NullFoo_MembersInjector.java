package test.nullables;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NullFoo_MembersInjector implements MembersInjector<NullFoo> {
  private final Provider<String> fieldInjectedStringAndStringProvider;
  private final Provider<Number> fieldInjectedNumberAndNumberProvider;

  public NullFoo_MembersInjector(Provider<String> fieldInjectedStringAndStringProvider, Provider<Number> fieldInjectedNumberAndNumberProvider) {  
    assert fieldInjectedStringAndStringProvider != null;
    this.fieldInjectedStringAndStringProvider = fieldInjectedStringAndStringProvider;
    assert fieldInjectedNumberAndNumberProvider != null;
    this.fieldInjectedNumberAndNumberProvider = fieldInjectedNumberAndNumberProvider;
  }

  @Override
  public void injectMembers(NullFoo instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.fieldInjectedString = fieldInjectedStringAndStringProvider.get();
    instance.fieldInjectedStringProvider = fieldInjectedStringAndStringProvider;
    instance.fieldInjectedNumber = fieldInjectedNumberAndNumberProvider.get();
    instance.fieldInjectedNumberProvider = fieldInjectedNumberAndNumberProvider;
    instance.inject(fieldInjectedStringAndStringProvider.get(), fieldInjectedStringAndStringProvider, fieldInjectedNumberAndNumberProvider.get(), fieldInjectedNumberAndNumberProvider);
  }

  public static MembersInjector<NullFoo> create(Provider<String> fieldInjectedStringAndStringProvider, Provider<Number> fieldInjectedNumberAndNumberProvider) {  
      return new NullFoo_MembersInjector(fieldInjectedStringAndStringProvider, fieldInjectedNumberAndNumberProvider);
  }
}

