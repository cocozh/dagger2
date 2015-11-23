package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum SingletonType_Factory implements Factory<SingletonType> {
INSTANCE;

  @Override
  public SingletonType get() {  
    return new SingletonType();
  }

  public static Factory<SingletonType> create() {  
    return INSTANCE;
  }
}

