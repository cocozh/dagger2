package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_BoundDoubleArrayFactory implements Factory<double[]> {
INSTANCE;

  @Override
  public double[] get() {  
    double[] provided = PrimitivesModule.boundDoubleArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<double[]> create() {  
    return INSTANCE;
  }
}

