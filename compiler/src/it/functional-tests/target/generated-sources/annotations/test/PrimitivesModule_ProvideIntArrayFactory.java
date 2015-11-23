package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideIntArrayFactory implements Factory<int[]> {
INSTANCE;

  @Override
  public int[] get() {  
    int[] provided = PrimitivesModule.provideIntArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<int[]> create() {  
    return INSTANCE;
  }
}

