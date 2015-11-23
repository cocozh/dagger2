package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ProvideFooKeyFactory implements Factory<String> {
  private final MultibindingModule module;
  private final Provider<Double> doubleDependencyProvider;

  public MultibindingModule_ProvideFooKeyFactory(MultibindingModule module, Provider<Double> doubleDependencyProvider) {  
    assert module != null;
    this.module = module;
    assert doubleDependencyProvider != null;
    this.doubleDependencyProvider = doubleDependencyProvider;
  }

  @Override
  public String get() {  
    String provided = module.provideFooKey(doubleDependencyProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(MultibindingModule module, Provider<Double> doubleDependencyProvider) {  
    return new MultibindingModule_ProvideFooKeyFactory(module, doubleDependencyProvider);
  }
}

