package test.membersinject;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MembersInjectGenericParent_MembersInjector<T> implements MembersInjector<MembersInjectGenericParent<T>> {
  private final Provider<T> tProvider;

  public MembersInjectGenericParent_MembersInjector(Provider<T> tProvider) {  
    assert tProvider != null;
    this.tProvider = tProvider;
  }

  @Override
  public void injectMembers(MembersInjectGenericParent<T> instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.t = tProvider.get();
  }

  public static <T> MembersInjector<MembersInjectGenericParent<T>> create(Provider<T> tProvider) {  
      return new MembersInjectGenericParent_MembersInjector<T>(tProvider);
  }
}

