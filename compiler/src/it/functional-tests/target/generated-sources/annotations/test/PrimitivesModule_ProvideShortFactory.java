package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideShortFactory implements Factory<Short> {
INSTANCE;

  @Override
  public Short get() {  
    Short provided = PrimitivesModule.provideShort();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Short> create() {  
    return INSTANCE;
  }
}

