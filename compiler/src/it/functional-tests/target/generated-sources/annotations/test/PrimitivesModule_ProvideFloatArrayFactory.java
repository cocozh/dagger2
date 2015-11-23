package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideFloatArrayFactory implements Factory<float[]> {
INSTANCE;

  @Override
  public float[] get() {  
    float[] provided = PrimitivesModule.provideFloatArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<float[]> create() {  
    return INSTANCE;
  }
}

