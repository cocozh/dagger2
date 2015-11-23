package test.builder.product;

import dagger.internal.Factory;
import javax.annotation.Generated;
import test.builder.abstractinjectmethod.RestClient;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum RestClient_Factory implements Factory<RestClient> {
INSTANCE;

  @Override
  public RestClient get() {  
    return new RestClient();
  }

  public static Factory<RestClient> create() {  
    return INSTANCE;
  }
}

