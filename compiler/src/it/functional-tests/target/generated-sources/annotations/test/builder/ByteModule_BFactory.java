package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ByteModule_BFactory implements Factory<Byte> {
  private final ByteModule module;

  public ByteModule_BFactory(ByteModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Byte get() {  
    Byte provided = module.b();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Byte> create(ByteModule module) {  
    return new ByteModule_BFactory(module);
  }
}

