package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GrandchildModule_ProvideNeedsAnInterfaceFactory implements Factory<NeedsAnInterface> {
  private final GrandchildModule module;
  private final Provider<AnInterface> anInterfaceProvider;

  public GrandchildModule_ProvideNeedsAnInterfaceFactory(GrandchildModule module, Provider<AnInterface> anInterfaceProvider) {  
    assert module != null;
    this.module = module;
    assert anInterfaceProvider != null;
    this.anInterfaceProvider = anInterfaceProvider;
  }

  @Override
  public NeedsAnInterface get() {  
    NeedsAnInterface provided = module.provideNeedsAnInterface(anInterfaceProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<NeedsAnInterface> create(GrandchildModule module, Provider<AnInterface> anInterfaceProvider) {  
    return new GrandchildModule_ProvideNeedsAnInterfaceFactory(module, anInterfaceProvider);
  }
}

