package test.subcomponent.hiding.a;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CommonName_Factory implements Factory<CommonName> {
  private final Provider<String> sProvider;

  public CommonName_Factory(Provider<String> sProvider) {  
    assert sProvider != null;
    this.sProvider = sProvider;
  }

  @Override
  public CommonName get() {  
    return new CommonName(sProvider.get());
  }

  public static Factory<CommonName> create(Provider<String> sProvider) {  
    return new CommonName_Factory(sProvider);
  }
}

