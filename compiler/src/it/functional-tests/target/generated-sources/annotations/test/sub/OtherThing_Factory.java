package test.sub;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class OtherThing_Factory implements Factory<OtherThing> {
  private final Provider<Integer> iProvider;

  public OtherThing_Factory(Provider<Integer> iProvider) {  
    assert iProvider != null;
    this.iProvider = iProvider;
  }

  @Override
  public OtherThing get() {  
    return new OtherThing(iProvider.get());
  }

  public static Factory<OtherThing> create(Provider<Integer> iProvider) {  
    return new OtherThing_Factory(iProvider);
  }
}

