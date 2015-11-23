package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum A_Factory implements Factory<A> {
INSTANCE;

  @Override
  public A get() {  
    return new A();
  }

  public static Factory<A> create() {  
    return INSTANCE;
  }
}

