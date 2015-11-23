package test;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GenericParent_MembersInjector<X, Y> implements MembersInjector<GenericParent<X, Y>> {
  private final Provider<X> xProvider;
  private final Provider<Y> yProvider;
  private final Provider<B> bProvider;

  public GenericParent_MembersInjector(Provider<X> xProvider, Provider<Y> yProvider, Provider<B> bProvider) {  
    assert xProvider != null;
    this.xProvider = xProvider;
    assert yProvider != null;
    this.yProvider = yProvider;
    assert bProvider != null;
    this.bProvider = bProvider;
  }

  @Override
  public void injectMembers(GenericParent<X, Y> instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.x = xProvider.get();
    instance.y = yProvider.get();
    instance.b = bProvider.get();
    instance.registerX(xProvider.get());
    instance.registerY(yProvider.get());
    instance.registerB(bProvider.get());
  }

  public static <X, Y> MembersInjector<GenericParent<X, Y>> create(Provider<X> xProvider, Provider<Y> yProvider, Provider<B> bProvider) {  
      return new GenericParent_MembersInjector<X, Y>(xProvider, yProvider, bProvider);
  }
}

