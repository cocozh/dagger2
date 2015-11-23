package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ProductOneModule_ProvideProductFactory implements Factory<Product> {
  private final ProductOneModule module;
  private final Provider<ProductOne> productOneProvider;

  public ProductOneModule_ProvideProductFactory(ProductOneModule module, Provider<ProductOne> productOneProvider) {  
    assert module != null;
    this.module = module;
    assert productOneProvider != null;
    this.productOneProvider = productOneProvider;
  }

  @Override
  public Product get() {  
    Product provided = module.provideProduct(productOneProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Product> create(ProductOneModule module, Provider<ProductOne> productOneProvider) {  
    return new ProductOneModule_ProvideProductFactory(module, productOneProvider);
  }
}

