package test;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GenericChild_MembersInjector<T> implements MembersInjector<GenericChild<T>> {
  private final MembersInjector<GenericParent<T, B>> supertypeInjector;
  private final Provider<A> aProvider;
  private final Provider<T> tProvider;

  public GenericChild_MembersInjector(MembersInjector<GenericParent<T, B>> supertypeInjector, Provider<A> aProvider, Provider<T> tProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert aProvider != null;
    this.aProvider = aProvider;
    assert tProvider != null;
    this.tProvider = tProvider;
  }

  @Override
  public void injectMembers(GenericChild<T> instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.a = aProvider.get();
    instance.t = tProvider.get();
    instance.registerA(aProvider.get());
    instance.registerT(tProvider.get());
  }

  public static <T> MembersInjector<GenericChild<T>> create(MembersInjector<GenericParent<T, B>> supertypeInjector, Provider<A> aProvider, Provider<T> tProvider) {  
      return new GenericChild_MembersInjector<T>(supertypeInjector, aProvider, tProvider);
  }
}

