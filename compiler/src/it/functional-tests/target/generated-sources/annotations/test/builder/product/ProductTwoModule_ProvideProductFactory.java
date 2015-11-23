package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ProductTwoModule_ProvideProductFactory implements Factory<Product> {
  private final ProductTwoModule module;
  private final Provider<ProductTwo> productTwoProvider;

  public ProductTwoModule_ProvideProductFactory(ProductTwoModule module, Provider<ProductTwo> productTwoProvider) {  
    assert module != null;
    this.module = module;
    assert productTwoProvider != null;
    this.productTwoProvider = productTwoProvider;
  }

  @Override
  public Product get() {  
    Product provided = module.provideProduct(productTwoProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Product> create(ProductTwoModule module, Provider<ProductTwo> productTwoProvider) {  
    return new ProductTwoModule_ProvideProductFactory(module, productTwoProvider);
  }
}

