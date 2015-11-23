package test;

import dagger.internal.Factory;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MultibindingModule_ProvideMapValuesFactory implements Factory<Collection<String>> {
  private final MultibindingModule module;
  private final Provider<Map<String, String>> mapProvider;

  public MultibindingModule_ProvideMapValuesFactory(MultibindingModule module, Provider<Map<String, String>> mapProvider) {  
    assert module != null;
    this.module = module;
    assert mapProvider != null;
    this.mapProvider = mapProvider;
  }

  @Override
  public Collection<String> get() {  
    Collection<String> provided = module.provideMapValues(mapProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Collection<String>> create(MultibindingModule module, Provider<Map<String, String>> mapProvider) {  
    return new MultibindingModule_ProvideMapValuesFactory(module, mapProvider);
  }
}

