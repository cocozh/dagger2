package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UnscopedType_Factory implements Factory<UnscopedType> {
  private final Provider<SingletonType> singletonTypeProvider;

  public UnscopedType_Factory(Provider<SingletonType> singletonTypeProvider) {  
    assert singletonTypeProvider != null;
    this.singletonTypeProvider = singletonTypeProvider;
  }

  @Override
  public UnscopedType get() {  
    return new UnscopedType(singletonTypeProvider.get());
  }

  public static Factory<UnscopedType> create(Provider<SingletonType> singletonTypeProvider) {  
    return new UnscopedType_Factory(singletonTypeProvider);
  }
}

