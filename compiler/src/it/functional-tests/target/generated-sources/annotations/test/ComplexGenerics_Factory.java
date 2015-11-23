package test;

import dagger.internal.DoubleCheckLazy;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ComplexGenerics_Factory implements Factory<ComplexGenerics> {
  private final Provider<Generic2<Generic<A>>> g2gaAndG2gaLazyProvider;
  private final Provider<Generic2<Generic<B>>> g2gbAndG2gbLazyProvider;
  private final Provider<Generic2<A>> g2aProvider;
  private final Provider<Generic<Generic2<A>>> gg2aProvider;
  private final Provider<Generic<Generic2<B>>> gg2bProvider;

  public ComplexGenerics_Factory(Provider<Generic2<Generic<A>>> g2gaAndG2gaLazyProvider, Provider<Generic2<Generic<B>>> g2gbAndG2gbLazyProvider, Provider<Generic2<A>> g2aProvider, Provider<Generic<Generic2<A>>> gg2aProvider, Provider<Generic<Generic2<B>>> gg2bProvider) {  
    assert g2gaAndG2gaLazyProvider != null;
    this.g2gaAndG2gaLazyProvider = g2gaAndG2gaLazyProvider;
    assert g2gbAndG2gbLazyProvider != null;
    this.g2gbAndG2gbLazyProvider = g2gbAndG2gbLazyProvider;
    assert g2aProvider != null;
    this.g2aProvider = g2aProvider;
    assert gg2aProvider != null;
    this.gg2aProvider = gg2aProvider;
    assert gg2bProvider != null;
    this.gg2bProvider = gg2bProvider;
  }

  @Override
  public ComplexGenerics get() {  
    return new ComplexGenerics(g2gaAndG2gaLazyProvider.get(), DoubleCheckLazy.create(g2gaAndG2gaLazyProvider), g2gaAndG2gaLazyProvider, g2gbAndG2gbLazyProvider.get(), DoubleCheckLazy.create(g2gbAndG2gbLazyProvider), g2gbAndG2gbLazyProvider, g2aProvider.get(), gg2aProvider.get(), gg2bProvider.get());
  }

  public static Factory<ComplexGenerics> create(Provider<Generic2<Generic<A>>> g2gaAndG2gaLazyProvider, Provider<Generic2<Generic<B>>> g2gbAndG2gbLazyProvider, Provider<Generic2<A>> g2aProvider, Provider<Generic<Generic2<A>>> gg2aProvider, Provider<Generic<Generic2<B>>> gg2bProvider) {  
    return new ComplexGenerics_Factory(g2gaAndG2gaLazyProvider, g2gbAndG2gbLazyProvider, g2aProvider, gg2aProvider, gg2bProvider);
  }
}

