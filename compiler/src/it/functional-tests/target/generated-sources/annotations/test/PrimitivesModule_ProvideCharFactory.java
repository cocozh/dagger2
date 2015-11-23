package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideCharFactory implements Factory<Character> {
INSTANCE;

  @Override
  public Character get() {  
    Character provided = PrimitivesModule.provideChar();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Character> create() {  
    return INSTANCE;
  }
}

