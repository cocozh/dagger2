package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ReferencesGeneric_Factory implements Factory<ReferencesGeneric> {
  private final Provider<Generic<A>> genericAProvider;

  public ReferencesGeneric_Factory(Provider<Generic<A>> genericAProvider) {  
    assert genericAProvider != null;
    this.genericAProvider = genericAProvider;
  }

  @Override
  public ReferencesGeneric get() {  
    return new ReferencesGeneric(genericAProvider.get());
  }

  public static Factory<ReferencesGeneric> create(Provider<Generic<A>> genericAProvider) {  
    return new ReferencesGeneric_Factory(genericAProvider);
  }
}

