package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Generic2_Factory<T> implements Factory<Generic2<T>> {
  private final Provider<T> tProvider;

  public Generic2_Factory(Provider<T> tProvider) {  
    assert tProvider != null;
    this.tProvider = tProvider;
  }

  @Override
  public Generic2<T> get() {  
    return new Generic2<T>(tProvider.get());
  }

  public static <T> Factory<Generic2<T>> create(Provider<T> tProvider) {  
    return new Generic2_Factory<T>(tProvider);
  }
}

