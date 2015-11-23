package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideLongFactory implements Factory<Long> {
INSTANCE;

  @Override
  public Long get() {  
    Long provided = PrimitivesModule.provideLong();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Long> create() {  
    return INSTANCE;
  }
}

