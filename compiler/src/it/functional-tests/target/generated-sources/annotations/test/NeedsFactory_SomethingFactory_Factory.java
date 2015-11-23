package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum NeedsFactory_SomethingFactory_Factory implements Factory<NeedsFactory_SomethingFactory> {
INSTANCE;

  @Override
  public NeedsFactory_SomethingFactory get() {  
    return new NeedsFactory_SomethingFactory();
  }

  public static Factory<NeedsFactory_SomethingFactory> create() {  
    return INSTANCE;
  }
}

