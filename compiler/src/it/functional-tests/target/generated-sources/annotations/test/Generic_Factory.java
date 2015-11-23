package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Generic_Factory<T> implements Factory<Generic<T>> {
  private final Provider<T> tProvider;

  public Generic_Factory(Provider<T> tProvider) {  
    assert tProvider != null;
    this.tProvider = tProvider;
  }

  @Override
  public Generic<T> get() {  
    return new Generic<T>(tProvider.get());
  }

  public static <T> Factory<Generic<T>> create(Provider<T> tProvider) {  
    return new Generic_Factory<T>(tProvider);
  }
}

