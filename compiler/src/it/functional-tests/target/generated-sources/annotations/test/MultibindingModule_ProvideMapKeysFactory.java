package test;

import dagger.internal.Factory;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ProvideMapKeysFactory implements Factory<Set<String>> {
  private final MultibindingModule module;
  private final Provider<Map<String, Provider<String>>> mapProvider;

  public MultibindingModule_ProvideMapKeysFactory(MultibindingModule module, Provider<Map<String, Provider<String>>> mapProvider) {  
    assert module != null;
    this.module = module;
    assert mapProvider != null;
    this.mapProvider = mapProvider;
  }

  @Override
  public Set<String> get() {  
    Set<String> provided = module.provideMapKeys(mapProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Set<String>> create(MultibindingModule module, Provider<Map<String, Provider<String>>> mapProvider) {  
    return new MultibindingModule_ProvideMapKeysFactory(module, mapProvider);
  }
}

