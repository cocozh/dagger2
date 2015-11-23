package test;

import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildIntegerModule_ProvideListOfIntegerFactory implements Factory<List<Integer>> {
  private final ChildIntegerModule module;

  public ChildIntegerModule_ProvideListOfIntegerFactory(ChildIntegerModule module) {  
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

  public static Factory<List<Integer>> create(ChildIntegerModule module) {  
    return new ChildIntegerModule_ProvideListOfIntegerFactory(module);
  }
}

