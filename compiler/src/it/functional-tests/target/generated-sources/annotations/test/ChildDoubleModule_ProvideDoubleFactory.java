package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildDoubleModule_ProvideDoubleFactory implements Factory<Double> {
  private final ChildDoubleModule module;

  public ChildDoubleModule_ProvideDoubleFactory(ChildDoubleModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Double get() {  
    Double provided = module.provideDouble();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Double> create(ChildDoubleModule module) {  
    return new ChildDoubleModule_ProvideDoubleFactory(module);
  }
}

