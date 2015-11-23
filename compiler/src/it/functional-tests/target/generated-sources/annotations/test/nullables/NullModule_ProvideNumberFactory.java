package test.nullables;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NullModule_ProvideNumberFactory implements Factory<Number> {
  private final NullModule module;

  public NullModule_ProvideNumberFactory(NullModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Number get() {  
    Number provided = module.provideNumber();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Number> create(NullModule module) {  
    return new NullModule_ProvideNumberFactory(module);
  }
}

