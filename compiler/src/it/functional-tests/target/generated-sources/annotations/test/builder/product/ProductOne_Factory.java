package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum ProductOne_Factory implements Factory<ProductOne> {
INSTANCE;

  @Override
  public ProductOne get() {  
    return new ProductOne();
  }

  public static Factory<ProductOne> create() {  
    return INSTANCE;
  }
}

