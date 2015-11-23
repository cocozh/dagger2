package test.builder.product;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerPackagerOneComponent implements PackagerOneComponent {
  private Provider<Product> provideProductProvider;
  private Provider<Packager> packagerProvider;

  private DaggerPackagerOneComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static PackagerOneComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideProductProvider = ProductOneModule_ProvideProductFactory.create(builder.productOneModule, ProductOne_Factory.create());
    this.packagerProvider = Packager_Factory.create(provideProductProvider);
  }

  @Override
  public Packager packager() {  
    return packagerProvider.get();
  }

  public static final class Builder {
    private ProductOneModule productOneModule;
  
    private Builder() {  
    }
  
    public PackagerOneComponent build() {  
      if (productOneModule == null) {
        this.productOneModule = new ProductOneModule();
      }
      return new DaggerPackagerOneComponent(this);
    }
  
    public Builder productOneModule(ProductOneModule productOneModule) {  
      if (productOneModule == null) {
        throw new NullPointerException("productOneModule");
      }
      this.productOneModule = productOneModule;
      return this;
    }
  }
}

