package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RequiresSingletons_Factory implements Factory<RequiresSingletons> {
  private final Provider<SingletonType> singletonTypeProvider;
  private final Provider<UnscopedType> unscopedTypeBoundAsSingletonProvider;

  public RequiresSingletons_Factory(Provider<SingletonType> singletonTypeProvider, Provider<UnscopedType> unscopedTypeBoundAsSingletonProvider) {  
    assert singletonTypeProvider != null;
    this.singletonTypeProvider = singletonTypeProvider;
    assert unscopedTypeBoundAsSingletonProvider != null;
    this.unscopedTypeBoundAsSingletonProvider = unscopedTypeBoundAsSingletonProvider;
  }

  @Override
  public RequiresSingletons get() {  
    return new RequiresSingletons(singletonTypeProvider.get(), unscopedTypeBoundAsSingletonProvider.get());
  }

  public static Factory<RequiresSingletons> create(Provider<SingletonType> singletonTypeProvider, Provider<UnscopedType> unscopedTypeBoundAsSingletonProvider) {  
    return new RequiresSingletons_Factory(singletonTypeProvider, unscopedTypeBoundAsSingletonProvider);
  }
}

