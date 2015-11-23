package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildIntegerModule_ProvideIntegerFactory implements Factory<Integer> {
  private final ChildIntegerModule module;

  public ChildIntegerModule_ProvideIntegerFactory(ChildIntegerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {  
    Integer provided = module.provideInteger();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Integer> create(ChildIntegerModule module) {  
    return new ChildIntegerModule_ProvideIntegerFactory(module);
  }
}

