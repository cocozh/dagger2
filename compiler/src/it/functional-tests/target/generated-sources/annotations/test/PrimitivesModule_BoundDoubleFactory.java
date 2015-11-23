package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_BoundDoubleFactory implements Factory<Double> {
INSTANCE;

  @Override
  public Double get() {  
    Double provided = PrimitivesModule.boundDouble();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Double> create() {  
    return INSTANCE;
  }
}

