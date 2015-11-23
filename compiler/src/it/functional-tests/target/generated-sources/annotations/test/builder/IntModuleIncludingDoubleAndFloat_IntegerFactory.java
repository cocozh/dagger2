package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class IntModuleIncludingDoubleAndFloat_IntegerFactory implements Factory<Integer> {
  private final IntModuleIncludingDoubleAndFloat module;

  public IntModuleIncludingDoubleAndFloat_IntegerFactory(IntModuleIncludingDoubleAndFloat module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {  
    Integer provided = module.integer();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Integer> create(IntModuleIncludingDoubleAndFloat module) {  
    return new IntModuleIncludingDoubleAndFloat_IntegerFactory(module);
  }
}

