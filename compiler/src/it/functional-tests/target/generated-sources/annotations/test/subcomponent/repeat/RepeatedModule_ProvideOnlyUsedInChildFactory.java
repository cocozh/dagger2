package test.subcomponent.repeat;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RepeatedModule_ProvideOnlyUsedInChildFactory implements Factory<OnlyUsedInChild> {
  private final RepeatedModule module;

  public RepeatedModule_ProvideOnlyUsedInChildFactory(RepeatedModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public OnlyUsedInChild get() {  
    OnlyUsedInChild provided = module.provideOnlyUsedInChild();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<OnlyUsedInChild> create(RepeatedModule module) {  
    return new RepeatedModule_ProvideOnlyUsedInChildFactory(module);
  }
}

