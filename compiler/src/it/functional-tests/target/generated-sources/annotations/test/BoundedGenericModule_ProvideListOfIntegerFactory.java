package test;

import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideListOfIntegerFactory implements Factory<List<Integer>> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideListOfIntegerFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public List<Integer> get() {  
    List<Integer> provided = module.provideListOfInteger();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<List<Integer>> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideListOfIntegerFactory(module);
  }
}

