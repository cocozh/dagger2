package test;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GenericDoubleReferences_Factory<T> implements Factory<GenericDoubleReferences<T>> {
  private final Provider<T> tAndT2Provider;
  private final Provider<Thing> aAndA2Provider;

  public GenericDoubleReferences_Factory(Provider<T> tAndT2Provider, Provider<Thing> aAndA2Provider) {  
    assert tAndT2Provider != null;
    this.tAndT2Provider = tAndT2Provider;
    assert aAndA2Provider != null;
    this.aAndA2Provider = aAndA2Provider;
  }

  @Override
  public GenericDoubleReferences<T> get() {  
    return new GenericDoubleReferences<T>(tAndT2Provider.get(), aAndA2Provider.get(), tAndT2Provider.get(), aAndA2Provider.get());
  }

  public static <T> Factory<GenericDoubleReferences<T>> create(Provider<T> tAndT2Provider, Provider<Thing> aAndA2Provider) {  
    return new GenericDoubleReferences_Factory<T>(tAndT2Provider, aAndA2Provider);
  }
}

