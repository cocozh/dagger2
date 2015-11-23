package test.subcomponent.hiding.b;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CommonName_Factory implements Factory<CommonName> {
  private final Provider<Integer> iProvider;

  public CommonName_Factory(Provider<Integer> iProvider) {  
    assert iProvider != null;
    this.iProvider = iProvider;
  }

  @Override
  public CommonName get() {  
    return new CommonName(iProvider.get());
  }

  public static Factory<CommonName> create(Provider<Integer> iProvider) {  
    return new CommonName_Factory(iProvider);
  }
}

