package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum ImplementsAnInterface_Factory implements Factory<ImplementsAnInterface> {
INSTANCE;

  @Override
  public ImplementsAnInterface get() {  
    return new ImplementsAnInterface();
  }

  public static Factory<ImplementsAnInterface> create() {  
    return INSTANCE;
  }
}

