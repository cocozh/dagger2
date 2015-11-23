package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NeedsFactory_Factory implements Factory<NeedsFactory> {
  private final Provider<NeedsFactory_SomethingFactory> somethingFactoryProvider;

  public NeedsFactory_Factory(Provider<NeedsFactory_SomethingFactory> somethingFactoryProvider) {  
    assert somethingFactoryProvider != null;
    this.somethingFactoryProvider = somethingFactoryProvider;
  }

  @Override
  public NeedsFactory get() {  
    return new NeedsFactory(somethingFactoryProvider.get());
  }

  public static Factory<NeedsFactory> create(Provider<NeedsFactory_SomethingFactory> somethingFactoryProvider) {  
    return new NeedsFactory_Factory(somethingFactoryProvider);
  }
}

