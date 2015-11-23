package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ParentModule_ProvideUnscopedTypeBoundAsSingletonFactory implements Factory<UnscopedType> {
  private final ParentModule module;
  private final Provider<UnscopedType> unscopedTypeProvider;

  public ParentModule_ProvideUnscopedTypeBoundAsSingletonFactory(ParentModule module, Provider<UnscopedType> unscopedTypeProvider) {  
    assert module != null;
    this.module = module;
    assert unscopedTypeProvider != null;
    this.unscopedTypeProvider = unscopedTypeProvider;
  }

  @Override
  public UnscopedType get() {  
    UnscopedType provided = module.provideUnscopedTypeBoundAsSingleton(unscopedTypeProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UnscopedType> create(ParentModule module, Provider<UnscopedType> unscopedTypeProvider) {  
    return new ParentModule_ProvideUnscopedTypeBoundAsSingletonFactory(module, unscopedTypeProvider);
  }
}

