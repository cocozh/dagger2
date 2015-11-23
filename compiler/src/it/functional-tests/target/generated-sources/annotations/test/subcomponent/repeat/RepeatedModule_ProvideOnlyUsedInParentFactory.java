package test.subcomponent.repeat;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RepeatedModule_ProvideOnlyUsedInParentFactory implements Factory<OnlyUsedInParent> {
  private final RepeatedModule module;

  public RepeatedModule_ProvideOnlyUsedInParentFactory(RepeatedModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public OnlyUsedInParent get() {  
    OnlyUsedInParent provided = module.provideOnlyUsedInParent();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<OnlyUsedInParent> create(RepeatedModule module) {  
    return new RepeatedModule_ProvideOnlyUsedInParentFactory(module);
  }
}

