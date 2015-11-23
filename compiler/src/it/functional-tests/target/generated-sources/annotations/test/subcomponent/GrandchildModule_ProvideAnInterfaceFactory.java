package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GrandchildModule_ProvideAnInterfaceFactory implements Factory<AnInterface> {
  private final GrandchildModule module;
  private final Provider<ImplementsAnInterface> implementsAnInterfaceProvider;

  public GrandchildModule_ProvideAnInterfaceFactory(GrandchildModule module, Provider<ImplementsAnInterface> implementsAnInterfaceProvider) {  
    assert module != null;
    this.module = module;
    assert implementsAnInterfaceProvider != null;
    this.implementsAnInterfaceProvider = implementsAnInterfaceProvider;
  }

  @Override
  public AnInterface get() {  
    AnInterface provided = module.provideAnInterface(implementsAnInterfaceProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<AnInterface> create(GrandchildModule module, Provider<ImplementsAnInterface> implementsAnInterfaceProvider) {  
    return new GrandchildModule_ProvideAnInterfaceFactory(module, implementsAnInterfaceProvider);
  }
}

