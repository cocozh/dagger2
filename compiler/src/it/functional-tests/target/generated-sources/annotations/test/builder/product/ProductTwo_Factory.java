package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum ProductTwo_Factory implements Factory<ProductTwo> {
INSTANCE;

  @Override
  public ProductTwo get() {  
    return new ProductTwo();
  }

  public static Factory<ProductTwo> create() {  
    return INSTANCE;
  }
}

