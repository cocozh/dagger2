package test.nullables;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NullFoo_Factory implements Factory<NullFoo> {
  private final MembersInjector<NullFoo> membersInjector;
  private final Provider<String> stringProvider;
  private final Provider<Number> numberProvider;

  public NullFoo_Factory(MembersInjector<NullFoo> membersInjector, Provider<String> stringProvider, Provider<Number> numberProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert stringProvider != null;
    this.stringProvider = stringProvider;
    assert numberProvider != null;
    this.numberProvider = numberProvider;
  }

  @Override
  public NullFoo get() {  
    NullFoo instance = new NullFoo(stringProvider.get(), stringProvider, numberProvider.get(), numberProvider);
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<NullFoo> create(MembersInjector<NullFoo> membersInjector, Provider<String> stringProvider, Provider<Number> numberProvider) {  
    return new NullFoo_Factory(membersInjector, stringProvider, numberProvider);
  }
}

