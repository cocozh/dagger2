package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideBooleanArrayFactory implements Factory<boolean[]> {
INSTANCE;

  @Override
  public boolean[] get() {  
    boolean[] provided = PrimitivesModule.provideBooleanArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<boolean[]> create() {  
    return INSTANCE;
  }
}

