package test;

import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildDoubleModule_ProvideListOfDoubleFactory implements Factory<List<Double>> {
  private final ChildDoubleModule module;

  public ChildDoubleModule_ProvideListOfDoubleFactory(ChildDoubleModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public List<Double> get() {  
    List<Double> provided = module.provideListOfDouble();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<List<Double>> create(ChildDoubleModule module) {  
    return new ChildDoubleModule_ProvideListOfDoubleFactory(module);
  }
}

