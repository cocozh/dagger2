package test.subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildModuleWithState_ProvideIntFactory implements Factory<Integer> {
  private final ChildModuleWithState module;

  public ChildModuleWithState_ProvideIntFactory(ChildModuleWithState module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {  
    Integer provided = module.provideInt();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Integer> create(ChildModuleWithState module) {  
    return new ChildModuleWithState_ProvideIntFactory(module);
  }
}

