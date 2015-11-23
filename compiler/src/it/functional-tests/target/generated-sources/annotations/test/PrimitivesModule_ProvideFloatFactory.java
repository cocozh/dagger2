package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideFloatFactory implements Factory<Float> {
INSTANCE;

  @Override
  public Float get() {  
    Float provided = PrimitivesModule.provideFloat();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Float> create() {  
    return INSTANCE;
  }
}

