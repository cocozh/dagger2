package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideIntegerFactory implements Factory<Integer> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideIntegerFactory(BoundedGenericModule module) {  
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

  public static Factory<Integer> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideIntegerFactory(module);
  }
}

