package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideCharArrayFactory implements Factory<char[]> {
INSTANCE;

  @Override
  public char[] get() {  
    char[] provided = PrimitivesModule.provideCharArray();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<char[]> create() {  
    return INSTANCE;
  }
}

