package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideIntFactory implements Factory<Integer> {
INSTANCE;

  @Override
  public Integer get() {  
    Integer provided = PrimitivesModule.provideInt();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Integer> create() {  
    return INSTANCE;
  }
}

