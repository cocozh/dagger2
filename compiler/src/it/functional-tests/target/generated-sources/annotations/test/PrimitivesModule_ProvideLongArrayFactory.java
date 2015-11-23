package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideLongArrayFactory implements Factory<long[]> {
INSTANCE;

  @Override
  public long[] get() {  
    long[] provided = PrimitivesModule.provideLongArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<long[]> create() {  
    return INSTANCE;
  }
}

