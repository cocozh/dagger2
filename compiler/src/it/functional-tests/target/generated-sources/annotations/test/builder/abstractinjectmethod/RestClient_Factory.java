package test.builder.abstractinjectmethod;

import dagger.internal.Factory;
import javax.annotation.Generated;

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

