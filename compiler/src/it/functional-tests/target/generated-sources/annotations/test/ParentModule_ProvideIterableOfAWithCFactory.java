package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ParentModule_ProvideIterableOfAWithCFactory<A extends Number & Comparable<A>, B, C extends Iterable<A>> implements Factory<Iterable<A>> {
  private final ParentModule<A, B, C> module;
  private final Provider<A> aProvider;
  private final Provider<C> cProvider;

  public ParentModule_ProvideIterableOfAWithCFactory(ParentModule<A, B, C> module, Provider<A> aProvider, Provider<C> cProvider) {  
    assert module != null;
    this.module = module;
    assert aProvider != null;
    this.aProvider = aProvider;
    assert cProvider != null;
    this.cProvider = cProvider;
  }

  @Override
  public Iterable<A> get() {  
    Iterable<A> provided = module.provideIterableOfAWithC(aProvider.get(), cProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static <A extends Number & Comparable<A>, B, C extends Iterable<A>> Factory<Iterable<A>> create(ParentModule<A, B, C> module, Provider<A> aProvider, Provider<C> cProvider) {  
    return new ParentModule_ProvideIterableOfAWithCFactory<A, B, C>(module, aProvider, cProvider);
  }
}

