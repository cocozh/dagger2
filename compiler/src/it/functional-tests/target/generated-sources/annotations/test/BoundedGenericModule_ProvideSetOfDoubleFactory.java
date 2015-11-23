package test;

import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideSetOfDoubleFactory implements Factory<Set<Double>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideSetOfDoubleFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Set<Double> get() {  
    Set<Double> provided = module.provideSetOfDouble();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Set<Double>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideSetOfDoubleFactory(module);
  }
}

