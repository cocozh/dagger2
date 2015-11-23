package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LongModule_LFactory implements Factory<Long> {
  private final LongModule module;

  public LongModule_LFactory(LongModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Long get() {  
    Long provided = module.l();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Long> create(LongModule module) {  
    return new LongModule_LFactory(module);
  }
}

