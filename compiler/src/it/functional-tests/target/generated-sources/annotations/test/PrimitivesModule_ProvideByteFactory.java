package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideByteFactory implements Factory<Byte> {
INSTANCE;

  @Override
  public Byte get() {  
    Byte provided = PrimitivesModule.provideByte();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Byte> create() {  
    return INSTANCE;
  }
}

