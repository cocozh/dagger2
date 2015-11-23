package test.builder;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DoubleModule_DFactory implements Factory<Double> {
  private final DoubleModule module;

  public DoubleModule_DFactory(DoubleModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Double get() {  
    Double provided = module.d();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Double> create(DoubleModule module) {  
    return new DoubleModule_DFactory(module);
  }
}

