package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Packager_Factory implements Factory<Packager> {
  private final Provider<Product> productProvider;

  public Packager_Factory(Provider<Product> productProvider) {  
    assert productProvider != null;
    this.productProvider = productProvider;
  }

  @Override
  public Packager get() {  
    return new Packager(productProvider.get());
  }

  public static Factory<Packager> create(Provider<Product> productProvider) {  
    return new Packager_Factory(productProvider);
  }
}

