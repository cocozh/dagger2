package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideShortArrayFactory implements Factory<short[]> {
INSTANCE;

  @Override
  public short[] get() {  
    short[] provided = PrimitivesModule.provideShortArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<short[]> create() {  
    return INSTANCE;
  }
}

