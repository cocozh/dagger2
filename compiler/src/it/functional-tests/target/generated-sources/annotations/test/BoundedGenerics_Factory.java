package test;

import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenerics_Factory<A extends Number & Comparable<? super A>, B extends List<? extends CharSequence>, C extends List<? super String>, D extends A, E extends Iterable<D>> implements Factory<BoundedGenerics<A, B, C, D, E>> {
  private final Provider<A> aProvider;
  private final Provider<B> bProvider;
  private final Provider<C> cProvider;
  private final Provider<D> dProvider;
  private final Provider<E> eProvider;

  public BoundedGenerics_Factory(Provider<A> aProvider, Provider<B> bProvider, Provider<C> cProvider, Provider<D> dProvider, Provider<E> eProvider) {  
    assert aProvider != null;
    this.aProvider = aProvider;
    assert bProvider != null;
    this.bProvider = bProvider;
    assert cProvider != null;
    this.cProvider = cProvider;
    assert dProvider != null;
    this.dProvider = dProvider;
    assert eProvider != null;
    this.eProvider = eProvider;
  }

  @Override
  public BoundedGenerics<A, B, C, D, E> get() {  
    return new BoundedGenerics<A, B, C, D, E>(aProvider.get(), bProvider.get(), cProvider.get(), dProvider.get(), eProvider.get());
  }

  public static <A extends Number & Comparable<? super A>, B extends List<? extends CharSequence>, C extends List<? super String>, D extends A, E extends Iterable<D>> Factory<BoundedGenerics<A, B, C, D, E>> create(Provider<A> aProvider, Provider<B> bProvider, Provider<C> cProvider, Provider<D> dProvider, Provider<E> eProvider) {  
    return new BoundedGenerics_Factory<A, B, C, D, E>(aProvider, bProvider, cProvider, dProvider, eProvider);
  }
}

