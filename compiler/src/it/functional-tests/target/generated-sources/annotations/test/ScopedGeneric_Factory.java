package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ScopedGeneric_Factory<T> implements Factory<ScopedGeneric<T>> {
  private final Provider<T> tProvider;

  public ScopedGeneric_Factory(Provider<T> tProvider) {  
    assert tProvider != null;
    this.tProvider = tProvider;
  }

  @Override
  public ScopedGeneric<T> get() {  
    return new ScopedGeneric<T>(tProvider.get());
  }

  public static <T> Factory<ScopedGeneric<T>> create(Provider<T> tProvider) {  
    return new ScopedGeneric_Factory<T>(tProvider);
  }
}

