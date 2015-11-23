package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideByteArrayFactory implements Factory<byte[]> {
INSTANCE;

  @Override
  public byte[] get() {  
    byte[] provided = PrimitivesModule.provideByteArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<byte[]> create() {  
    return INSTANCE;
  }
}

