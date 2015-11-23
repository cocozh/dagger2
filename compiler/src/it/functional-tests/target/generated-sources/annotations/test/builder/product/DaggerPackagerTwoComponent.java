package test.builder.product;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerPackagerTwoComponent implements PackagerTwoComponent {
  private Provider<Product> provideProductProvider;
  private Provider<Packager> packagerProvider;

  private DaggerPackagerTwoComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static PackagerTwoComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideProductProvider = ProductTwoModule_ProvideProductFactory.create(builder.productTwoModule, ProductTwo_Factory.create());
    this.packagerProvider = Packager_Factory.create(provideProductProvider);
  }

  @Override
  public Packager packager() {  
    return packagerProvider.get();
  }

  public static final class Builder {
    private ProductTwoModule productTwoModule;
  
    private Builder() {  
    }
  
    public PackagerTwoComponent build() {  
      if (productTwoModule == null) {
        this.productTwoModule = new ProductTwoModule();
      }
      return new DaggerPackagerTwoComponent(this);
    }
  
    public Builder productTwoModule(ProductTwoModule productTwoModule) {  
      if (productTwoModule == null) {
        throw new NullPointerException("productTwoModule");
      }
      this.productTwoModule = productTwoModule;
      return this;
    }
  }
}

