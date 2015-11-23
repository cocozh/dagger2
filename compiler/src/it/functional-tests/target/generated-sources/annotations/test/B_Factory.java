package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum B_Factory implements Factory<B> {
INSTANCE;

  @Override
  public B get() {  
    return new B();
  }

  public static Factory<B> create() {  
    return INSTANCE;
  }
}

